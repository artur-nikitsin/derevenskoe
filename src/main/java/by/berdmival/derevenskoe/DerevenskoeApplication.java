package by.berdmival.derevenskoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
public class DerevenskoeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DerevenskoeApplication.class, args);
    }

}
