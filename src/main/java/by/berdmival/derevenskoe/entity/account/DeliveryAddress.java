package by.berdmival.derevenskoe.entity.account;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "addresses")
public class DeliveryAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String city;
    private String street;
    private String house;
    private String flat;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
