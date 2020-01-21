package by.berdmival.derevenskoe.repository.order;

import by.berdmival.derevenskoe.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
