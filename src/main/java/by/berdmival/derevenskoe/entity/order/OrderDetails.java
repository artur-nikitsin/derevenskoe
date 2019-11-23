package by.berdmival.derevenskoe.entity.order;

import by.berdmival.derevenskoe.entity.product.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    public OrderDetails(Order order, Product product, Integer quantity) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
    }

    @Transient
    public Double getTotalPrice() {
        return this.getProduct().getPrice() * this.getQuantity();
    }
}
