package com.hwadee.controller;

import com.hwadee.entity.Account;
import com.hwadee.entity.Weibo;
import com.hwadee.service.inter.AccountService;
import com.hwadee.service.inter.WeiboService;
import org.codehaus.plexus.component.annotations.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
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
@Controller
@WebServlet(name = "WeiboDeployController")
public class WeiboDeployController extends HttpServlet {
    @Autowired
    private WeiboService weiboService;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int wid = Integer.parseInt(req.getParameter("wid"));
        Weibo weibo = new Weibo();
        weibo.setWid(wid);
        weiboService.deployWeibo(weibo);
    }

    public WeiboService getWeiboService() {
        return weiboService;
    }
}
