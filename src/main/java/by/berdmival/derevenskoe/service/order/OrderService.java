package by.berdmival.derevenskoe.service.order;

import by.berdmival.derevenskoe.entity.account.Account;
import by.berdmival.derevenskoe.entity.order.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();

    List<Order> getAllByUserId(Long userId);

    Order addOrderForUser(Order order, Account account);

    Order update(Order order);

    Order getById(Long orderId);

    void deleteById(Long orderId);
}