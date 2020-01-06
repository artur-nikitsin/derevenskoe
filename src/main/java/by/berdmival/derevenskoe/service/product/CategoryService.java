package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;

import java.util.List;

public interface CategoryService {
    Category findByName(String name);

    Category findById(Long categoryId);

    List<Category> getAll();

    Category save(Category category);

    Category getById(Long categoryId);

    void deleteById(Long categoryId);
}
