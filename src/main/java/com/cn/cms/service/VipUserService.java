package com.cn.cms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.cms.base.BaseDao;
import com.cn.cms.base.BaseService;
import com.cn.cms.dao.VipUserDao;
import com.cn.cms.entity.VipUser;
import com.cn.cms.utils.CommonUtil;

@Service
public class VipUserService extends BaseService<VipUser, Long> {
    @Autowired
    private VipUserDao vipUserDao;

    @Override
    protected BaseDao<VipUser, Long> getDao() {
        return vipUserDao;
    }

    @Override
    protected Class<VipUser> getTClass() {
        return VipUser.class;
    }

    @Transactional(readOnly = true)
    public List<VipUser> getVipuserList(String userName, String password) {
        StringBuilder stringBuilder = new StringBuilder("select * from vipuser where 1=1 ");
        Map<String, Object> params = new HashMap<String, Object>();
        if (!CommonUtil.isEmpty(userName)) {
            params.put("userName", userName);
            stringBuilder.append("and userName=:userName ");
        }
        if (!CommonUtil.isEmpty(password)) {
            params.put("password", password);
            stringBuilder.append("and password=:password ");
        }
        return vipUserDao.sqlQuery(VipUser.class, stringBuilder.toString(), params);
    }

}
