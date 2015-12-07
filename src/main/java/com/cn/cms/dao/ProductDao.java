package com.cn.cms.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cn.cms.base.BaseDao;
import com.cn.cms.entity.Product;

/**
 * 用户
 * 
 * @author jiang
 * 
 */

@Repository
@Transactional(readOnly = true)
public class ProductDao extends BaseDao<Product, Long> {
}