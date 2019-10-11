package com.ant.app.entity;

import java.io.Serializable;

/**
 * account
 * @author 
 */
public class Account implements Serializable {
    private Integer userId;

    /**
     * 余额
     */
    private Long balance;

    /**
     * 消费总额
     */
    private Long expenditure;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Long expenditure) {
        this.expenditure = expenditure;
    }
}