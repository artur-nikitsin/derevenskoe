package by.berdmival.derevenskoe.controller;

import by.berdmival.bookstore.service.security.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/users")
    ResponseEntity<UserDetails> addUser(@RequestParam String username, @RequestParam String password) {
        return ResponseEntity.ok(userService.addUser(username, password));
    }
}
