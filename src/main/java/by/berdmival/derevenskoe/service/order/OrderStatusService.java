package by.berdmival.derevenskoe.service.order;

import by.berdmival.derevenskoe.entity.order.OrderStatus;

public interface OrderStatusService {
    OrderStatus getByName(String name);

    OrderStatus getById(int id);
}
