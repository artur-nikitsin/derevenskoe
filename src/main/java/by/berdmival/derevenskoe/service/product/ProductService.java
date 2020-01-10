package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.entity.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Product save(Product product);

    Product update(Product product);

    Page<Product> findAll(Pageable pageable);

    Product findById(Long id);

    void deleteOneById(Long id);

    Page<Product> findByCategory(Category category, Pageable pageable);
}
