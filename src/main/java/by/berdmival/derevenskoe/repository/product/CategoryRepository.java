package by.berdmival.derevenskoe.repository.product;

import by.berdmival.derevenskoe.entity.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
