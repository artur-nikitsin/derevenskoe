package by.berdmival.derevenskoe.repository.order;

import by.berdmival.derevenskoe.entity.order.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetail, Long> {
}
