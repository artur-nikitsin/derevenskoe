package by.berdmival.derevenskoe.repository.order;

import by.berdmival.derevenskoe.entity.order.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {
    OrderStatus findByName(String name);
}
