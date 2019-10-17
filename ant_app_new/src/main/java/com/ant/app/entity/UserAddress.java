package com.ant.app.entity;

import java.io.Serializable;

/**
 * user_address
 * @author 
 */
public class UserAddress implements Serializable {
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 详细地址
     */
    private String detailedAddress;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 0 默认收货地址 1 普通收货地址
     */
    private String default;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDefault() {
        return default;
    }

    public void setDefault(String default) {
        this.default = default;
    }
}