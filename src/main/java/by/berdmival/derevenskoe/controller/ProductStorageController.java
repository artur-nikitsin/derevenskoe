package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.entity.product.Product;
import by.berdmival.derevenskoe.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductStorageController {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/products")
    ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping(path = "/products")
    ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.saveOne(product));
    }

    @PutMapping(path = "/products/{productId}")
    ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable("productId") Long bookId) {
        product.setId(bookId);
        return ResponseEntity.ok(productService.saveOne(product));
    }

    @GetMapping(path = "/products/{productId}")
    ResponseEntity<Product> getProductById(@PathVariable("productId") Long bookId) {
        Product product = productService.findById(bookId);
        if (product.getId() == bookId) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(path = "/products/{productId}")
    void deleteProductById(@PathVariable("productId") Long bookId) {
        productService.deleteOneById(bookId);
    }

    @DeleteMapping(path = "/products")
    void deleteProduct(@RequestBody Product product) {
        productService.deleteOne(product);
    }
}
