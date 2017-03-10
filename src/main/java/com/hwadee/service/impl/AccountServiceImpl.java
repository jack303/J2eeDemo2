package com.hwadee.service.impl;

import com.hwadee.dao.AccountMapper;
import com.hwadee.entity.Account;
import com.hwadee.service.inter.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by localdomain on 2017/3/9.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public Account login(String email, String password) {
        //数据库查询
        Account account = new Account();
        account.setEmail(email);
        account.setPassword(password);
        Account check = accountMapper.getAccountByEmail(email);
        System.out.print(check.toString());
        if(check==null)
        {
            throw new RuntimeException("the account is null");
        }
        else if(!account.getPassword().equals(check.getPassword()))
        {
            throw new RuntimeException("the password is wrong");
        }
        return account;
    }
}
