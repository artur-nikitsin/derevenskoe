package by.berdmival.derevenskoe.entity.order;

import by.berdmival.derevenskoe.entity.product.Product;
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

    @ManyToOne
    private Product product;
    private int quantity;

    @Transient
    public Double getTotalPrice() {
        return this.getProduct().getPrice() * this.getQuantity();
    }
}
