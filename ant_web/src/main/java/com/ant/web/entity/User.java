package com.ant.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String icon;

    /**
     * 性别（1男 2女）
     */
    private String sex;

    /**
     * 用户状态（0正常 1禁用 ）
     */
    private String state;

    /**
     * 邀请码
     */
    private String invitationCode;

    /**
     * 邀请人 名字(ID:XX)
     */
    private String inviterPeople;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 注册时间
     */
    private Date registertime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 角色（0无 1团长)
     */
    private String role;

    /**
     * 钱包余额
     */
    private Long money;

    /**
     * 关联微信号
     */
    private String wechatCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public String getInviterPeople() {
        return inviterPeople;
    }

    public void setInviterPeople(String inviterPeople) {
        this.inviterPeople = inviterPeople;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getWechatCode() {
        return wechatCode;
    }

    public void setWechatCode(String wechatCode) {
        this.wechatCode = wechatCode;
    }
}