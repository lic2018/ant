package com.ant.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * active
 * @author 
 */
public class Active implements Serializable {
    private Integer id;

    /**
     * 1首页banner 2首页icon 3会场活动
     */
    private String type;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片
     */
    private String icon;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 跳转方式 1不跳转 2商品详情 3链接 4活动会场
     */
    private String jumpway;

    /**
     * 商品id 用，隔开
     */
    private String goodsId;

    /**
     * 开始时间
     */
    private Date beginDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态 0 正常 1 删除  2 结束
     */
    private String state;

    /**
     * 访问数
     */
    private Integer visitNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getJumpway() {
        return jumpway;
    }

    public void setJumpway(String jumpway) {
        this.jumpway = jumpway;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }
}