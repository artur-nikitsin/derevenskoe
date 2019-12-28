package by.berdmival.derevenskoe.entity.account;

import by.berdmival.derevenskoe.entity.order.Order;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id", unique = true)
    private long userId;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String phoneNumber;
    private String email;
    private String photoUri;

    @JsonManagedReference
    @OneToMany(mappedBy = "account")
    private List<DeliveryAddress> address;


    @OneToMany
    private List<Order> orders;
}
