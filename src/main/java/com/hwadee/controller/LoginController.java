package com.hwadee.controller;

import com.hwadee.entity.Account;
import com.hwadee.service.inter.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by localdomain on 2017/3/9.
 */
@WebServlet(name = "LoginController")
@Controller
public class LoginController extends HttpServlet {
    @Autowired
    private AccountService accountService;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("username");
        String password = req.getParameter("password");

        try{
            Account account = accountService.login(email,password);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public AccountService getAccountService() {
        return accountService;
    }
}
