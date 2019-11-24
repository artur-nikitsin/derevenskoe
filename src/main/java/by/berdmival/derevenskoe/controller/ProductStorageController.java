package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.entity.product.Product;
import by.berdmival.derevenskoe.service.product.CategoryService;
import by.berdmival.derevenskoe.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductStorageController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping(path = "/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.saveOne(product));
    }

    @PutMapping(path = "/products/{productId}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable("productId") Long bookId) {
        product.setId(bookId);
        return ResponseEntity.ok(productService.saveOne(product));
    }

    @GetMapping(path = "/products/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable("productId") Long bookId) {
        Product product = productService.findById(bookId);
        if (product.getId() == bookId) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(path = "/products/{productId}")
    public void deleteProductById(@PathVariable("productId") Long bookId) {
        productService.deleteOneById(bookId);
    }

    @DeleteMapping(path = "/products")
    public void deleteProduct(@RequestBody Product product) {
        productService.deleteOne(product);
    }

    @GetMapping(path = "/products/{categoryName}")
    public ResponseEntity<List<Product>> findByCategory(@PathVariable("categoryName") String categoryName){
        return ResponseEntity.ok(productService.findByCategory(categoryService.findByName(categoryName)));
    }
}
