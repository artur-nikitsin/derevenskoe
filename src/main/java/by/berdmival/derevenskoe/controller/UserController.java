package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.service.account.AccountService;
import by.berdmival.derevenskoe.service.account.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private AccountService accountService;

    @PostMapping(path = "/users")
    public ResponseEntity<UserDetails> addUser(@RequestParam String username, @RequestParam String password) {
        UserDetails userDetails = userService.addUser(username, password);
//        Account account = new Account();
//        account.setUsername(userDetails.getUsername());
//        accountService.add(account);
        return ResponseEntity.ok(userDetails);
    }

    @RequestMapping("/users/validate")
    public Principal user(Principal user) {
        return user;
    }
}
