package by.berdmival.derevenskoe.repository.account;

import by.berdmival.derevenskoe.entity.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
