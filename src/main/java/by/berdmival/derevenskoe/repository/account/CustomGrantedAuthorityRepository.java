package by.berdmival.derevenskoe.repository.account;

import by.berdmival.derevenskoe.entity.account.CustomGrantedAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomGrantedAuthorityRepository extends JpaRepository<CustomGrantedAuthority, String> {
}
