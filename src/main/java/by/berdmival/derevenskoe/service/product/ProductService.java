package by.berdmival.derevenskoe.service.product;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.entity.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    Product update(Product product);

    List<Product> saveSeveral(List<Product> products);

    Page<Product> findAll(Pageable pageable);

    Product findById(Long id);

    void deleteOne(Product product);

    void deleteOneById(Long id);

    Page<Product> findByCategory(Category category, Pageable pageable);
}
