//package by.berdmival.derevenskoe.service.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.sql.DataSource;
//
//@Service
//@Repository
//@Transactional
//public class UserService {
//    private final PasswordEncoder passwordEncoder;
//    private JdbcUserDetailsManager userDetailsManager;
//
//    @Autowired
//    public UserService(DataSource dataSource, PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//        this.userDetailsManager = new JdbcUserDetailsManager(dataSource);
//    }
//
//    public UserDetails addUser(String username, String password) {
//        userDetailsManager.createUser(User.withUsername(username)
//                .password(passwordEncoder.encode(password))
//                .authorities("USER")
//                .disabled(false)
//                .build());
//        return userDetailsManager.loadUserByUsername(username);
//    }
//}
