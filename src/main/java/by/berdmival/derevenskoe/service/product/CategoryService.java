package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;

public interface CategoryService {
    Category findByName(String name);
}
