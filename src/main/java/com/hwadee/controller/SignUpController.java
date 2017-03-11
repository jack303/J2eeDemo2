package com.hwadee.controller;

import com.hwadee.entity.Account;
import com.hwadee.service.inter.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by localdomain on 2017/3/10.
 */
@Controller
public class SignUpController extends HttpServlet {
    @Autowired
    AccountService accountService;
    @RequestMapping(value = "signup")
    public String signup(Account account,HttpSession session)
    {
        try {
            accountService.signup(account);
            session.setAttribute("user",account);
            return "redirect:/";
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return "forward:login.jsp";
    }

}
