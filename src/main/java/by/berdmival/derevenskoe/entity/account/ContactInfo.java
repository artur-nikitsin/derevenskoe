package by.berdmival.derevenskoe.entity.account;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users_contact_info")
public class ContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String phoneNumber;
    private String email;

    @OneToMany
    private List<DeliveryAddress> address;
}
