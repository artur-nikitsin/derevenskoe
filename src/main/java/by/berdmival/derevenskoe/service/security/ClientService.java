package by.berdmival.derevenskoe.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Service
@Repository
@Transactional
public class ClientService {
    private JdbcClientDetailsService clientDetailsService;

    @Autowired
    public ClientService(DataSource dataSource, PasswordEncoder passwordEncoder) {
        this.clientDetailsService = new JdbcClientDetailsService(dataSource);
        clientDetailsService.setPasswordEncoder(passwordEncoder);
    }

    public ClientDetails getClientById(String clientId) {
        return clientDetailsService.loadClientByClientId(clientId);
    }

    public ClientDetails addClient(ClientDetails clientDetails) {
        clientDetailsService.addClientDetails(clientDetails);
        return clientDetailsService.loadClientByClientId(clientDetails.getClientId());
    }
}
