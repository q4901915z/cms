package com.cn.cms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.cms.base.ResultBean;
import com.cn.cms.entity.User;
import com.cn.cms.service.UserService;
import com.cn.cms.utils.CommonUtil;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public Object login(HttpServletRequest request, User model) {
        ResultBean resultBean = new ResultBean();
        User user = userService.getUserByParams(model.getUserName(), model.getPassword());
        if (CommonUtil.isEmpty(user)) {
            resultBean.setErrMsg("用户名或密码错误");
            return resultBean;
        }
        resultBean.setData(user);
        return resultBean;
    }

    @ResponseBody
    @RequestMapping("/registPwd")
    public Object registPwd(HttpServletRequest request, User mode) {
        ResultBean resultBean = new ResultBean();
        String sign = request.getParameter("sign");
        if (!"caicaikanba".equals(sign)) {
            resultBean.setErrMsg("验证码错误");
            return resultBean;
        }
        User user = userService.getUserByParams(mode.getUserName(), null);
        if (CommonUtil.isEmpty(user)) {
            resultBean.setErrMsg("账号输入错误");
            return resultBean;
        }
        user.setPassword(mode.getPassword());
        userService.save(user);
        resultBean.setMsg("密码修改成功");
        return resultBean;
    }
}