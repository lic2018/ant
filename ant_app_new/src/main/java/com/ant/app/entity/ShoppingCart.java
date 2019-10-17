package com.ant.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * shopping_cart
 * @author 
 */
public class ShoppingCart implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品标题
     */
    private String goodsTitle;

    /**
     * 商品规格
     */
    private Double goodsSize;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 商品图片
     */
    private String goodsIcon;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public Double getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(Double goodsSize) {
        this.goodsSize = goodsSize;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsIcon() {
        return goodsIcon;
    }

    public void setGoodsIcon(String goodsIcon) {
        this.goodsIcon = goodsIcon;
    }
}