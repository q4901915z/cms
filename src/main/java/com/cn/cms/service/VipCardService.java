package com.cn.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.cms.base.BaseDao;
import com.cn.cms.base.BaseService;
import com.cn.cms.dao.VipCardDao;
import com.cn.cms.entity.VipCard;

@Service
public class VipCardService extends BaseService<VipCard, Long> {
    @Autowired
    private VipCardDao vipCardDao;

    @Override
    protected BaseDao<VipCard, Long> getDao() {
        return vipCardDao;
    }

    @Override
    protected Class<VipCard> getTClass() {
        return VipCard.class;
    }

}
