package by.berdmival.derevenskoe.entity.account;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "granted_authorities")
public class CustomGrantedAuthority implements GrantedAuthority {
    @Id
    private String authority;

    public CustomGrantedAuthority(String authority) {
        this.authority = authority;
    }
}
