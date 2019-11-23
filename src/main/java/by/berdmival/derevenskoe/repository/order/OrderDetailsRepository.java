package by.berdmival.derevenskoe.repository.order;

import by.berdmival.derevenskoe.entity.order.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}
