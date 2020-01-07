package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.entity.product.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    Product update(Product product);

    List<Product> saveSeveral(List<Product> products);

    List<Product> findAll();

    Product findById(Long id);

    void deleteOne(Product product);

    void deleteOneById(Long id);

    List<Product> findByCategory(Category category);
}
