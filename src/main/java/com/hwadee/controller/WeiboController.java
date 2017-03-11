package com.hwadee.controller;

import com.hwadee.entity.Account;
import com.hwadee.model.PageInfo;
import com.hwadee.service.inter.WeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/u")

public class WeiboController extends HttpServlet {

    @Autowired
    WeiboService weiboService;
    @RequestMapping(value = "/{aid}/weibo")
    public @ResponseBody PageInfo list(@RequestParam(defaultValue = "1") int current, @PathVariable("aid") int aid, HttpSession session, Model model)
    {
        Account account = (Account)session.getAttribute("user");
        try {
            if (account.getAid()!=aid)
            {
                throw new Exception("ID不匹配");
            }
            PageInfo pi = weiboService.list(aid,current);
            System.out.print(pi.toString());
            //为何不用session
            //model.addAttribute("pi",pi);

            return pi;
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return new PageInfo();
    }

    //网址跳转
    @RequestMapping(value = "/{aid}/home")
    public String homePage(@RequestParam(defaultValue = "1") int current, @PathVariable("aid") int aid, HttpSession session, Model model)
    {
        Account account = (Account)session.getAttribute("user");
        try {
            if (account.getAid()!=aid)
            {
                throw new Exception("ID不匹配");
            }

            //为何不用session
            //model.addAttribute("pi",pi);

            return "index";
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return "redirect:index.jsp";
    }
}
