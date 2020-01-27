package by.berdmival.derevenskoe.entity.account;

import by.berdmival.derevenskoe.entity.order.Order;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "users")
public class Account extends User {
    @Id
    private String username;
    private String password;
    private boolean enabled;

    private String firstName;
    private String lastName;
    private String patronymic;
    private String photoUri;

    private String phoneNumber;
    private String email;

    @OneToMany
    private List<DeliveryAddress> address;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "user"
    )
    private List<Order> orders;

    @ManyToMany
    @JoinTable(
            name = "authorities",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "authority")
    )
    private Set<CustomGrantedAuthority> authorities;

    public Account() {
        super("U", "P", AuthorityUtils.createAuthorityList("USER"));
    }

    public Collection<GrantedAuthority> getAuthorities() {
        return Collections.unmodifiableSet(authorities);
    }
}
