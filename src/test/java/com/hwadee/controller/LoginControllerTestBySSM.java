package com.hwadee.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by localdomain on 2017/3/10.
 */
public class LoginControllerTestBySSM extends BaseTest {
    @Autowired
    private LoginController loginController;

    @Test
    public void testLogin() throws Exception {
        MockHttpServletRequestBuilder requestBuiler =
                MockMvcRequestBuilders.post("/login");

        requestBuiler.accept(MediaType.TEXT_HTML);
        requestBuiler.param("email", "zhangsan@163.com");
        requestBuiler.param("password", "123456");
        ResultActions ra = mockMvc.perform( requestBuiler );

        MvcResult mvcResult = ra.andReturn();
        ModelAndView modelAndView = mvcResult.getModelAndView();
        System.out.println(modelAndView.getViewName());

    }
}
