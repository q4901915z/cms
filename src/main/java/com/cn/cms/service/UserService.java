package com.cn.cms.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cms.dao.UserDao;
import com.cn.cms.entity.User;
import com.cn.cms.utils.CommonUtil;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserByParams(String userName, String password) {
        StringBuilder stringBuilder = new StringBuilder("select * from user where 1=1 ");
        Map<String, Object> params = new HashMap<String, Object>();
        if (!CommonUtil.isEmpty(userName)) {
            params.put("userName", userName);
            stringBuilder.append("and userName=:userName ");
        }
        if (!CommonUtil.isEmpty(password)) {
            params.put("password", password);
            stringBuilder.append("and password=:password ");
        }
        return userDao.sqlUniqueQuery(User.class, stringBuilder.toString(), params);
    }
}
