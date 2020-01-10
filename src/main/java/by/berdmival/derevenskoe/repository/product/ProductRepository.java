package by.berdmival.derevenskoe.repository.product;

import by.berdmival.derevenskoe.entity.product.Category;
import by.berdmival.derevenskoe.entity.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAllByCategory(Category category, Pageable pageable);
}
