package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.service.product.CategoryService;
import by.berdmival.derevenskoe.util.FileManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

@Api(value = "Products categories management system")
@RestController
public class ProductCategoryController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    private FileManager fileManager;
    @Value("${upload.categories}")
    private String categoryDir;

    @ApiOperation(value = "Get all categories", response = List.class)
    @GetMapping(path = "/categories")
    public ResponseEntity<List<Category>> allCategories() {
        return ResponseEntity.ok(categoryService.getAll());
    }

    @ApiOperation(value = "Create the category", response = Category.class)
    @PostMapping(path = "/categories")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.save(category));
    }

    @ApiOperation(value = "Update the category", response = Category.class)
    @PutMapping("/categories/{categoryId}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category, @PathVariable("categoryId") Long categoryId) {
        categoryService.findById(categoryId);
        category.setId(categoryId);
        return ResponseEntity.ok(categoryService.update(category));
    }

    @ApiOperation(value = "Get the category with id", response = Category.class)
    @GetMapping("/categories/{categoryId}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("categoryId") Long categoryId) {
        return ResponseEntity.ok(categoryService.findById(categoryId));
    }

    @ApiOperation(value = "Delete the category")
    @DeleteMapping("/categories/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long categoryId) throws NoSuchFileException {
        Category category = categoryService.findById(categoryId);
        String imageName = category.getPhotoFileName();
        categoryService.deleteById(categoryId);
        if (imageName != null) {
            fileManager.deleteImage(
                    categoryDir,
                    Long.toString(categoryId),
                    imageName
            );
        }
    }

    @ApiOperation(value = "Load images for the category", response = Category.class)
    @PostMapping(path = "/categories/{categoryId}/image")
    public ResponseEntity<Category> addPicture(@PathVariable("categoryId") Long categoryId,
                                               @RequestParam("image") MultipartFile uploadFiles
    ) throws IOException {
        Category category = categoryService.findById(categoryId);
        category.setPhotoFileName(
                fileManager.uploadImage(
                        categoryDir,
                        Long.toString(categoryId),
                        uploadFiles
                )
        );
        return ResponseEntity.ok(categoryService.update(category));
    }

    @ApiOperation(value = "Delete the image of the category", response = Category.class)
    @DeleteMapping(path = "/categories/{categoryId}/image/{imageName}")
    public ResponseEntity<Category> deletePictures(@PathVariable("categoryId") Long categoryId,
                                                   @PathVariable("imageName") String imageName
    ) throws NoSuchFileException {
        Category category = categoryService.findById(categoryId);
        if (fileManager.deleteImage(
                categoryDir,
                Long.toString(categoryId),
                imageName
        )) {
            category.setPhotoFileName("");
        }
        return ResponseEntity.ok(categoryService.update(category));
    }
}
