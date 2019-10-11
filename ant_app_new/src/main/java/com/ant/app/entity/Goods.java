package com.ant.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * goods
 * @author 
 */
public class Goods implements Serializable {
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品库存
     */
    private Integer inventory;

    /**
     * 进货价
     */
    private BigDecimal purchasePrice;

    /**
     * 价格
     */
    private BigDecimal price;

    private Date createTime;

    /**
     * 宣传主图
     */
    private String mainImage;

    /**
     * 图片 最多10张
     */
    private String image;

    /**
     * 0 上架 1 下架 2 售罄
     */
    private String state;

    /**
     * 一级分类
     */
    private String firstClass;

    /**
     * 二级分类
     */
    private String secondClass;

    /**
     * 主标题
     */
    private String mainTitle;

    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 一级返佣比例（团长返佣）
     */
    private Double firstCommissionRate;

    /**
     * 二级返佣比例（团长下级返佣）
     */
    private Double secondCommissionRate;

    /**
     * 三级返佣比例（团长下级的下级返佣）
     */
    private Double thirdCommissionRate;

    /**
     * 虚拟阅读数
     */
    private String virtualPageview;

    /**
     * 参数
     */
    private String parameter;

    /**
     * 属性
     */
    private String attribute;

    /**
     * 详情
     */
    private String datail;

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

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }

    public String getSecondClass() {
        return secondClass;
    }

    public void setSecondClass(String secondClass) {
        this.secondClass = secondClass;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Double getFirstCommissionRate() {
        return firstCommissionRate;
    }

    public void setFirstCommissionRate(Double firstCommissionRate) {
        this.firstCommissionRate = firstCommissionRate;
    }

    public Double getSecondCommissionRate() {
        return secondCommissionRate;
    }

    public void setSecondCommissionRate(Double secondCommissionRate) {
        this.secondCommissionRate = secondCommissionRate;
    }

    public Double getThirdCommissionRate() {
        return thirdCommissionRate;
    }

    public void setThirdCommissionRate(Double thirdCommissionRate) {
        this.thirdCommissionRate = thirdCommissionRate;
    }

    public String getVirtualPageview() {
        return virtualPageview;
    }

    public void setVirtualPageview(String virtualPageview) {
        this.virtualPageview = virtualPageview;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getDatail() {
        return datail;
    }

    public void setDatail(String datail) {
        this.datail = datail;
    }
}