package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;

import java.util.List;

public interface CategoryService {
    Category findById(Long categoryId);

    List<Category> getAll();

    Category save(Category category);

    void deleteById(Long categoryId);

    Category update(Category category);
}
