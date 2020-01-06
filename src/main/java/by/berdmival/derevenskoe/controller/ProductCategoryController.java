package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.service.product.CategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Products categories management system")
@RestController
public class ProductCategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping(path = "/categories")
    public ResponseEntity<List<Category>> allCategories() {
        return ResponseEntity.ok(categoryService.getAll());
    }

    @PostMapping(path = "/categories")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.save(category));
    }

    @PutMapping("/categories/{categoryId}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category, @PathVariable("categoryId") Long categoryId) {
        category.setId(categoryId);
        return ResponseEntity.ok(categoryService.save(category));
    }

    @GetMapping("/categories/{categoryId}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("categoryId") Long categoryId) {
        return ResponseEntity.ok(categoryService.getById(categoryId));
    }

    @DeleteMapping("/categories/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long categoryId) {
        categoryService.deleteById(categoryId);
    }
}
