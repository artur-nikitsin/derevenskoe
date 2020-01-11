package by.berdmival.derevenskoe.entity.order;

import by.berdmival.derevenskoe.entity.account.Account;
import by.berdmival.derevenskoe.entity.account.UserMainInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Account account;

    private LocalDateTime orderDateTime;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "order_status_id", referencedColumnName = "id")
    private OrderStatus orderStatus;

    @JsonManagedReference
    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetails;

    @Transient
    public Double getTotalOrderPrice() {
        return this.getOrderDetails().stream().reduce(
                0.0,
                (tp, od) -> tp + od.getTotalPrice(),
                Double::sum);
    }
}