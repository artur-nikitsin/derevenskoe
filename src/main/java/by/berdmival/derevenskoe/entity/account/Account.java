package by.berdmival.derevenskoe.entity.account;

import by.berdmival.derevenskoe.entity.order.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "main_info_id", referencedColumnName = "id")
    private UserMainInfo userMainInfo;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "contact_info_id", referencedColumnName = "id")
    private ContactInfo contactInfo;

    private String photoUri;

    @JsonIgnore
    @OneToMany
    private List<Order> orders;
}
