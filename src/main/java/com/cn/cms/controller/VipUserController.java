package com.cn.cms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.cms.base.ResultBean;
import com.cn.cms.entity.User;
import com.cn.cms.entity.VipUser;
import com.cn.cms.service.VipUserService;
import com.cn.cms.utils.CommonUtil;

@Controller
@RequestMapping("/vipuser")
public class VipUserController {
    @Autowired
    private VipUserService vipUserService;

    @RequestMapping("/vipuserHp")
    public String vipuserHp(HttpServletRequest request) {
        return "vipuser/vipuserlist";
    }

    @ResponseBody
    @RequestMapping("/getVipuserList")
    public Object getVipuserList(HttpServletRequest request, User model) {
        ResultBean resultBean = new ResultBean();
        List<VipUser> user = vipUserService.getVipuserList(model.getUserName(), model.getPassword());
        if (CommonUtil.isEmpty(user)) {
            resultBean.setErrMsg("用户名或密码错误");
            return resultBean;
        }
        resultBean.setData(user);
        return resultBean;
    }
}