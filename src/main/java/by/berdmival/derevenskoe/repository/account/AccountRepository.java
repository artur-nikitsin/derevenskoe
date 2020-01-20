package by.berdmival.derevenskoe.repository.account;

import by.berdmival.derevenskoe.entity.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<Account> findAccountByUsername(String username);
}
