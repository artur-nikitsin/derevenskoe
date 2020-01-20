package by.berdmival.derevenskoe.service.account;

import by.berdmival.derevenskoe.entity.account.CustomGrantedAuthority;
import by.berdmival.derevenskoe.exception.account.CustomGrantedAuthorityNotFoundException;
import by.berdmival.derevenskoe.repository.account.CustomGrantedAuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customGrantedAuthorityService")
@Repository
@Transactional
public class CustomGrantedAuthorityServiceImpl implements CustomGrantedAuthorityService {
    @Autowired
    private CustomGrantedAuthorityRepository customGrantedAuthorityRepository;

    @Override
    public CustomGrantedAuthority add(String authority) {
        return customGrantedAuthorityRepository.save(
                new CustomGrantedAuthority(authority)
        );
    }

    @Override
    public CustomGrantedAuthority find(String authority) {
        return customGrantedAuthorityRepository.findById(authority).orElseThrow(
                () -> new CustomGrantedAuthorityNotFoundException(authority)
        );
    }
}
