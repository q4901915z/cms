package com.cn.cms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cms.dao.ProductDao;
import com.cn.cms.entity.Product;
import com.cn.cms.utils.CommonUtil;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> getUserByParams(String userName, String password) {
        StringBuilder stringBuilder = new StringBuilder("select * from product where 1=1 ");
        Map<String, Object> params = new HashMap<String, Object>();
        if (!CommonUtil.isEmpty(userName)) {
            params.put("userName", userName);
            stringBuilder.append("and userName=:userName ");
        }
        if (!CommonUtil.isEmpty(password)) {
            params.put("password", password);
            stringBuilder.append("and password=:password ");
        }
        stringBuilder.append("and state=1 order by modifyTime DESC");
        return productDao.sqlQuery(Product.class, stringBuilder.toString(), params);
    }
}
