package by.berdmival.derevenskoe.repository.product;

import by.berdmival.derevenskoe.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
