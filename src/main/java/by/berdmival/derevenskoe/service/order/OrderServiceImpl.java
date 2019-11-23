package by.berdmival.derevenskoe.service.order;

import by.berdmival.derevenskoe.entity.order.Order;
import by.berdmival.derevenskoe.repository.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service("orderService")
@Repository
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderStatusService orderStatusService;

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> getAllByUser(String username) {
        return orderRepository.findAllByUsername(username);
    }

    @Override
    public Order addOrderForUser(Order order, String username) {
        order.setUsername(username);
        order.setOrderDateTime(LocalDateTime.now());
        order.setOrderStatus(orderStatusService.getByName("New"));
        return orderRepository.save(order);
    }

    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getById(Long orderId) {
        return orderRepository.getOne(orderId);
    }

    @Override
    public void deleteById(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
