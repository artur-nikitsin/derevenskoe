package by.berdmival.derevenskoe.service.account;

import by.berdmival.derevenskoe.entity.account.Account;

public interface AccountService {
    Account add(String username, String password);

    Account findByUsername(String username);
}
