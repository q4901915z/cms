package com.cn.cms.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cn.cms.base.BaseDao;
import com.cn.cms.entity.User;

/**
 * 用户
 * 
 * @author jiang
 * 
 */

@Repository
@Transactional(readOnly = true)
public class UserDao extends BaseDao<User, Long> {
}