package com.hwadee.service.inter;

import com.hwadee.entity.Account;
import org.springframework.stereotype.Component;

/**
 * Created by localdomain on 2017/3/9.
 */
@Component
public interface AccountService {
    Account login(String email, String password);

    int signup(Account account);
}
