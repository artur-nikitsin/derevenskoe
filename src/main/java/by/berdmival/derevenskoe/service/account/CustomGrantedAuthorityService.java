package by.berdmival.derevenskoe.service.account;

import by.berdmival.derevenskoe.entity.account.CustomGrantedAuthority;

public interface CustomGrantedAuthorityService {
    CustomGrantedAuthority add(String authority);

    CustomGrantedAuthority find(String authority);
}
