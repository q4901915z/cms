package com.cn.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cms.base.BaseDao;
import com.cn.cms.base.BaseService;
import com.cn.cms.dao.OrderDao;
import com.cn.cms.entity.Order;

@Service
public class OrderService extends BaseService<Order, Long> {
    @Autowired
    private OrderDao orderDao;

    @Override
    protected BaseDao<Order, Long> getDao() {
        return orderDao;
    }

    @Override
    protected Class<Order> getTClass() {
        return Order.class;
    }

}
