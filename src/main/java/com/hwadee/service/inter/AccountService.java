package com.hwadee.service.inter;

import com.hwadee.entity.Account;

/**
 * Created by localdomain on 2017/3/9.
 */
public interface AccountService {
    Account login(String email, String password);
}
