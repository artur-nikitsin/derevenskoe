package by.berdmival.derevenskoe.entity.order;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order_statuses")
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", unique = true)
    private String name;
}
