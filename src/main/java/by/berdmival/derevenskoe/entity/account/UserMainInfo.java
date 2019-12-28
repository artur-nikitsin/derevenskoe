package by.berdmival.derevenskoe.entity.account;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users_main_info")
public class UserMainInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String patronymic;
}
