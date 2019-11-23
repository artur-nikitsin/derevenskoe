package by.berdmival.derevenskoe.service.order;

import by.berdmival.derevenskoe.entity.order.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();

    List<Order> getAllByUser(String username);

    Order addOrderForUser(Order order, String username);

    Order update(Order order);

    Order getById(Long orderId);

    void deleteById(Long orderId);
}
