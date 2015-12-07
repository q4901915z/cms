package com.cn.cms.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@SuppressWarnings("serial")
@Table(name = "product")
/**
 * 商品
 * @author jiang
 *
 */
public class Product {
    // 产品Id
    private Long productId;
    // 名称
    private String productName;
    // 类别
    private Long productType;
    // 库存
    private Long productNum;
    // 规格
    private String productSpec;
    // 单价
    private BigDecimal price;
    // 商品截图
    private String snapshotsUrl;
    // 商品描述
    private String description;
    // 状态：-1下架，1上架,0待审核
    private Long state;
    //
    private Date createTime;
    //
    private Date modifyTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductType() {
        return productType;
    }

    public void setProductType(Long productType) {
        this.productType = productType;
    }

    public Long getProductNum() {
        return productNum;
    }

    public void setProductNum(Long productNum) {
        this.productNum = productNum;
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSnapshotsUrl() {
        return snapshotsUrl;
    }

    public void setSnapshotsUrl(String snapshotsUrl) {
        this.snapshotsUrl = snapshotsUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}
