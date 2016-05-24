package com.cn.cms.entity;

import java.io.Serializable;
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
@Table(name = "vipcard")
public class VipCard implements Serializable {

    private Long vipcardId;
    // 会员卡名称
    private String vipcardName;
    // 会员卡类型
    private Long vipcardType;
    // 会员卡卡描述
    private String vipcardDesc;
    // 会员卡状态
    private Long state;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date modifyTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getVipcardId() {
        return vipcardId;
    }

    public void setVipcardId(Long vipcardId) {
        this.vipcardId = vipcardId;
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

    public String getVipcardName() {
        return vipcardName;
    }

    public void setVipcardName(String vipcardName) {
        this.vipcardName = vipcardName;
    }

    public Long getVipcardType() {
        return vipcardType;
    }

    public void setVipcardType(Long vipcardType) {
        this.vipcardType = vipcardType;
    }

    public String getVipcardDesc() {
        return vipcardDesc;
    }

    public void setVipcardDesc(String vipcardDesc) {
        this.vipcardDesc = vipcardDesc;
    }
}
