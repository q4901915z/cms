package com.cn.cms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.cms.entity.User;
import com.cn.cms.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, User model) {
        User user = userService.getUserByParams(model.getUserName(), model.getPassword());
        request.setAttribute("user", user);
        return "../../home";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        return "home/login";
    }
}