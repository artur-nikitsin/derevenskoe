package by.berdmival.derevenskoe.entity.order;

import by.berdmival.derevenskoe.entity.account.Account;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    private LocalDateTime orderDateTime;

    private String customerAddress;
    private String customerPhone;
    private String customerName;

    @OneToOne
    @JoinColumn(name = "order_status_id", referencedColumnName = "id")
    private OrderStatus orderStatus;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;

    @JsonIgnore
    @ManyToOne
    private Account user;

    @Transient
    public Double getTotalOrderPrice() {
        return this.getOrderDetails().stream().reduce(
                0.0,
                (tp, od) -> tp + od.getTotalPrice(),
                Double::sum);
    }
}
