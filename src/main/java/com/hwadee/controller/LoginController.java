package com.hwadee.controller;

import com.hwadee.entity.Account;
import com.hwadee.service.inter.AccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
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
 * Created by localdomain on 2017/3/9.
 */

@Controller
public class LoginController extends HttpServlet {
    //    }
//        return accountService;
    @RequestMapping(value = "login")
    public String login(@Param("email") String email, @Param("password") String password, HttpSession session)
    {
        try {
            Account account = accountService.login(email,password);
            session.setAttribute("user",account);
            return "redirect:/";
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return "forward:login.jsp";
    }

    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/")
    public String index(){
        return "welcomPage";
    }
/*protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("username");
        String password = req.getParameter("password");

        try{
            Account account = accountService.login(email,password);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    */
//    public AccountService getAccountService() {
}
