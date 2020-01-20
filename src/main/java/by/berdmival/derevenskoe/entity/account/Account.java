package by.berdmival.derevenskoe.entity.account;

import by.berdmival.derevenskoe.entity.order.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToMany
    @JoinTable(
            name = "authorities",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "authority")
    )
    private Set<CustomGrantedAuthority> authorities;

    public Collection<GrantedAuthority> getAuthorities() {
        return Collections.unmodifiableSet(authorities);
    }

    @OneToOne
    @JoinColumn(name = "main_info_id", referencedColumnName = "id")
    private UserMainInfo userMainInfo;

    @OneToOne
    @JoinColumn(name = "contact_info_id", referencedColumnName = "id")
    private ContactInfo contactInfo;

    private String photoUri;

    @JsonIgnore
    @OneToMany
    private List<Order> orders;

    public Account(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public Account() {
        this("U", "P", AuthorityUtils.createAuthorityList("USER"));
    }
}
