package com.ant.app.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * account_statement
 * @author 
 */
public class AccountStatement implements Serializable {
    private Integer id;

    /**
     * 类型 1 商品订单 2 团长佣金 3 月度奖励
     */
    private Integer type;

    /**
     * 金额
     */
    private Long amount;

    /**
     * 时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String desc;

    /**
     * 状态 0 正常 1 审核中 2 审核拒绝
     */
    private Integer state;

    /**
     * 订单号
     */
    private String code;

    private String username;

    private Integer userId;

    private String nickname;

    private String orderNickname;

    /**
     * 月份
     */
    private String month;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOrderNickname() {
        return orderNickname;
    }

    public void setOrderNickname(String orderNickname) {
        this.orderNickname = orderNickname;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}