package by.berdmival.derevenskoe.service.account;

import by.berdmival.derevenskoe.entity.account.Account;
import by.berdmival.derevenskoe.repository.account.AccountRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Service("accountService")
@Repository
@Transactional
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;
    private JdbcUserDetailsManager userDetailsManager;

    public AccountServiceImpl(
            AccountRepository accountRepository,
            PasswordEncoder passwordEncoder,
            DataSource dataSource
    ) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsManager = new JdbcUserDetailsManager(dataSource);
    }

    @Override
    public Account add(String username, String password) {
        userDetailsManager.createUser(User
                .withUsername(username)
                .password(passwordEncoder.encode(password))
                .authorities("ROLE_USER")
                .disabled(false)
                .build()
        );
        return accountRepository.findAccountByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException(username)
        );
    }

    @Override
    public Account findByUsername(String username) {
        return accountRepository.findAccountByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException(username)
        );
    }
}
