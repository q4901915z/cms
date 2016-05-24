package com.cn.cms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SuppressWarnings("serial")
@Table(name = "vipuser")
public class VipUser implements Serializable {

    private Long vipuserId;
    // 会员卡名称
    private String vipuserName;
    // vip用户电话
    private String vipuserPhone;
    // 会员卡类型
    private Long vipcardType;
    // 会员消费金额
    private BigDecimal useMoney;
    // 会员卡剩余金额
    private BigDecimal remainMoney;
    // 会员卡状态
    private Long state;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date modifyTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getVipuserId() {
        return vipuserId;
    }

    public void setVipuserId(Long vipuserId) {
        this.vipuserId = vipuserId;
    }

    public String getVipuserName() {
        return vipuserName;
    }

    public void setVipuserName(String vipuserName) {
        this.vipuserName = vipuserName;
    }

    public String getVipuserPhone() {
        return vipuserPhone;
    }

    public void setVipuserPhone(String vipuserPhone) {
        this.vipuserPhone = vipuserPhone;
    }

    public BigDecimal getUseMoney() {
        return useMoney;
    }

    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    public BigDecimal getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(BigDecimal remainMoney) {
        this.remainMoney = remainMoney;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    @Column(name = "createTime", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "modifyTime", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getVipcardType() {
        return vipcardType;
    }

    public void setVipcardType(Long vipcardType) {
        this.vipcardType = vipcardType;
    }

}
