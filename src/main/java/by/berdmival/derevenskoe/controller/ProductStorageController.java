package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.entity.product.Product;
import by.berdmival.derevenskoe.service.product.CategoryService;
import by.berdmival.derevenskoe.service.product.ProductService;
import by.berdmival.derevenskoe.utils.FileManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Api(value = "Products management system")
@RestController
public class ProductStorageController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private FileManager fileManager;

    @ApiOperation(value = "Get all products in the storage", response = List.class)
    @GetMapping(path = "/products")
    public ResponseEntity<Page<Product>> getAllProducts(Pageable pageable) {
        return ResponseEntity.ok(productService.findAll(pageable));
    }

    @ApiOperation(value = "Add new product in the storage", response = Product.class)
    @PostMapping(path = "/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

    @ApiOperation(value = "Load images for the product", response = Product.class)
    @PostMapping(path = "/products/{productId}/images")
    public ResponseEntity<Product> addPictures(@PathVariable("productId") Long productId,
                                               @RequestParam("files") MultipartFile[] uploadFiles
    ) throws IOException {
        return ResponseEntity.ok(
                productService.update(
                        fileManager.uploadProductImage(
                                productService.findById(productId),
                                uploadFiles
                        )
                )
        );
    }

    @ApiOperation(value = "Delete the image of the product", response = Product.class)
    @DeleteMapping(path = "/products/{productId}/images/{imageName}")
    public ResponseEntity<Product> deletePictures(@PathVariable("productId") Long productId,
                                                  @PathVariable("imageName") String imageName
    ) {
        return ResponseEntity.ok(
                productService.update(
                        fileManager.deleteProductImage(
                                productService.findById(productId),
                                imageName
                        )
                )
        );
    }

    @ApiOperation(value = "Update product in the storage", response = Product.class)
    @PutMapping(path = "/products/{productId}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable("productId") Long productId) {
        productService.findById(productId);
        product.setId(productId);
        return ResponseEntity.ok(productService.update(product));
    }

    @ApiOperation(value = "Get product in the storage by it's id", response = Product.class)
    @GetMapping(path = "/products/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable("productId") Long productId) {
        return ResponseEntity.ok(productService.findById(productId));
    }

    @ApiOperation(value = "Delete product in the storage by it's id", response = void.class)
    @DeleteMapping(path = "/products/{productId}")
    public void deleteProductById(@PathVariable("productId") Long productId) {
        productService.findById(productId);
        productService.deleteOneById(productId);
    }

    @ApiOperation(value = "Get all products in the storage by category id", response = List.class)
    @GetMapping(path = "/products/category/{categoryId}")
    public ResponseEntity<Page<Product>> findByCategoryId(
            @PathVariable("categoryId") Long categoryId,
            Pageable pageable
    ) {
        return ResponseEntity.ok(productService.findByCategory(categoryService.findById(categoryId), pageable));
    }
}
