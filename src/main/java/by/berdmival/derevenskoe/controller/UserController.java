package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.entity.account.CustomGrantedAuthority;
import by.berdmival.derevenskoe.service.account.AccountService;
import by.berdmival.derevenskoe.service.account.CustomGrantedAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private CustomGrantedAuthorityService customGrantedAuthorityService;

    @PostMapping(path = "/users")
    public ResponseEntity<UserDetails> addUser(@RequestParam String username, @RequestParam String password) {
        return ResponseEntity.ok(accountService.add(username, password));
    }

    @PostMapping(path = "/users/roles")
    public ResponseEntity<CustomGrantedAuthority> addRole(@RequestParam String role) {
        return ResponseEntity.ok(customGrantedAuthorityService.add(role));
    }
}
