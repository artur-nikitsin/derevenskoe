package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.dto.OrderForm;
import by.berdmival.derevenskoe.dto.OrderProductDto;
import by.berdmival.derevenskoe.entity.account.Account;
import by.berdmival.derevenskoe.entity.order.Order;
import by.berdmival.derevenskoe.entity.order.OrderDetails;
import by.berdmival.derevenskoe.service.order.OrderDetailsService;
import by.berdmival.derevenskoe.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderDetailsService orderDetailsService;
    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/orders")
    public ResponseEntity<List<Order>> allOrders() {
        return ResponseEntity.ok(orderService.getAll());
    }

    @GetMapping(path = "/orders/{userId}")
    public ResponseEntity<List<Order>> getCurrentUserOrders(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(orderService.getAllByUserId(userId));
    }

    @PostMapping(path = "/orders")
    public ResponseEntity<Order> addOrder(@RequestBody OrderForm form, Account account) {
        List<OrderProductDto> orderProductDtoList = form.getProducts();

        Order order = new Order();
        orderService.addOrderForUser(order, account);

        List<OrderDetails> orderProducts = new ArrayList<>();
        for (OrderProductDto dto : orderProductDtoList) {
            orderProducts.add(orderDetailsService.create(new OrderDetails(order, dto.getProduct(), dto.getQuantity())));
        }

        order.setOrderDetails(orderProducts);

        return ResponseEntity.ok(orderService.update(order));
    }

    @PutMapping("/orders/{orderId}")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order, @PathVariable("orderId") Long orderId) {
        order.setId(orderId);
        return ResponseEntity.ok(orderService.update(order));
    }

    @GetMapping("/orders/{orderId}")
    public ResponseEntity<Order> updateOrder(@PathVariable("orderId") Long orderId) {
        return ResponseEntity.ok(orderService.getById(orderId));
    }

    @DeleteMapping("/orders/{orderId}")
    public void deleteOrder(@PathVariable("orderId") Long orderId) {
        orderService.deleteById(orderId);
    }
}
