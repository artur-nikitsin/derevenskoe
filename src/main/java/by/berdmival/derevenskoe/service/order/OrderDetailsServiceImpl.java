package by.berdmival.derevenskoe.service.order;

import by.berdmival.derevenskoe.entity.order.OrderDetail;
import by.berdmival.derevenskoe.repository.order.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("orderDetailsService")
@Repository
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderDetail create(OrderDetail orderDetail) {
        return orderDetailsRepository.save(orderDetail);
    }
}
