package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.entity.order.Order;
import by.berdmival.derevenskoe.service.account.AccountService;
import by.berdmival.derevenskoe.service.order.OrderDetailsService;
import by.berdmival.derevenskoe.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderDetailsService orderDetailsService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private AccountService accountService;

    @GetMapping(path = "/orders")
    public ResponseEntity<List<Order>> allOrders() {
        return ResponseEntity.ok(orderService.getAll());
    }

    @PostMapping(path = "/orders")
    public ResponseEntity<Order> addOrder(@RequestBody Order order, Principal principal) {
        return ResponseEntity.ok(
                orderService.addOrderForUser(
                        order,
                        accountService.findByUsername(
                                principal.getName()
                        )
                )
        );
    }

    @PutMapping("/orders/{orderId}")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order, @PathVariable("orderId") Long orderId) {
        order.setId(orderId);
        return ResponseEntity.ok(orderService.update(order));
    }

    @GetMapping("/orders/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable("orderId") Long orderId) {
        return ResponseEntity.ok(orderService.getById(orderId));
    }

    @DeleteMapping("/orders/{orderId}")
    public void deleteOrder(@PathVariable("orderId") Long orderId) {
        orderService.deleteById(orderId);
    }
}
