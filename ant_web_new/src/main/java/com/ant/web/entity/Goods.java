package com.ant.web.entity;

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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getInventory() == null ? other.getInventory() == null : this.getInventory().equals(other.getInventory()))
            && (this.getPurchasePrice() == null ? other.getPurchasePrice() == null : this.getPurchasePrice().equals(other.getPurchasePrice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getMainImage() == null ? other.getMainImage() == null : this.getMainImage().equals(other.getMainImage()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getFirstClass() == null ? other.getFirstClass() == null : this.getFirstClass().equals(other.getFirstClass()))
            && (this.getSecondClass() == null ? other.getSecondClass() == null : this.getSecondClass().equals(other.getSecondClass()))
            && (this.getMainTitle() == null ? other.getMainTitle() == null : this.getMainTitle().equals(other.getMainTitle()))
            && (this.getSubTitle() == null ? other.getSubTitle() == null : this.getSubTitle().equals(other.getSubTitle()))
            && (this.getFirstCommissionRate() == null ? other.getFirstCommissionRate() == null : this.getFirstCommissionRate().equals(other.getFirstCommissionRate()))
            && (this.getSecondCommissionRate() == null ? other.getSecondCommissionRate() == null : this.getSecondCommissionRate().equals(other.getSecondCommissionRate()))
            && (this.getThirdCommissionRate() == null ? other.getThirdCommissionRate() == null : this.getThirdCommissionRate().equals(other.getThirdCommissionRate()))
            && (this.getVirtualPageview() == null ? other.getVirtualPageview() == null : this.getVirtualPageview().equals(other.getVirtualPageview()))
            && (this.getParameter() == null ? other.getParameter() == null : this.getParameter().equals(other.getParameter()))
            && (this.getAttribute() == null ? other.getAttribute() == null : this.getAttribute().equals(other.getAttribute()))
            && (this.getDatail() == null ? other.getDatail() == null : this.getDatail().equals(other.getDatail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getInventory() == null) ? 0 : getInventory().hashCode());
        result = prime * result + ((getPurchasePrice() == null) ? 0 : getPurchasePrice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getMainImage() == null) ? 0 : getMainImage().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getFirstClass() == null) ? 0 : getFirstClass().hashCode());
        result = prime * result + ((getSecondClass() == null) ? 0 : getSecondClass().hashCode());
        result = prime * result + ((getMainTitle() == null) ? 0 : getMainTitle().hashCode());
        result = prime * result + ((getSubTitle() == null) ? 0 : getSubTitle().hashCode());
        result = prime * result + ((getFirstCommissionRate() == null) ? 0 : getFirstCommissionRate().hashCode());
        result = prime * result + ((getSecondCommissionRate() == null) ? 0 : getSecondCommissionRate().hashCode());
        result = prime * result + ((getThirdCommissionRate() == null) ? 0 : getThirdCommissionRate().hashCode());
        result = prime * result + ((getVirtualPageview() == null) ? 0 : getVirtualPageview().hashCode());
        result = prime * result + ((getParameter() == null) ? 0 : getParameter().hashCode());
        result = prime * result + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        result = prime * result + ((getDatail() == null) ? 0 : getDatail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", inventory=").append(inventory);
        sb.append(", purchasePrice=").append(purchasePrice);
        sb.append(", price=").append(price);
        sb.append(", createTime=").append(createTime);
        sb.append(", mainImage=").append(mainImage);
        sb.append(", image=").append(image);
        sb.append(", state=").append(state);
        sb.append(", firstClass=").append(firstClass);
        sb.append(", secondClass=").append(secondClass);
        sb.append(", mainTitle=").append(mainTitle);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", firstCommissionRate=").append(firstCommissionRate);
        sb.append(", secondCommissionRate=").append(secondCommissionRate);
        sb.append(", thirdCommissionRate=").append(thirdCommissionRate);
        sb.append(", virtualPageview=").append(virtualPageview);
        sb.append(", parameter=").append(parameter);
        sb.append(", attribute=").append(attribute);
        sb.append(", datail=").append(datail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}