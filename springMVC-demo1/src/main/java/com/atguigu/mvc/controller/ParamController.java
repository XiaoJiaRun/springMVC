package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JiaLess
 */
@Controller
public class ParamController {
/*
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username " + username +  " password " + password);
        return "success";
    }
*/
    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("username " + username +  " password " + password);
        return "success";
    }

    @RequestMapping("/testpojo")
    public String testBean(User user) {
        System.out.println(user);
        return "success";
    }

}
