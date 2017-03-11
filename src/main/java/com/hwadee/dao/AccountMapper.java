package com.hwadee.dao;

import com.hwadee.entity.Account;
import com.hwadee.model.AccountDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by localdomain on 2017/3/6.
 */
@Service
public interface AccountMapper {
    Account getAccountById(int aid);
    Account getAccountByEmail(String email);
    List<Account> findAll(AccountDto accountDto);
    int insert(Account account);
}
