package com.ant.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * order
 * @author 
 */
public class Order implements Serializable {
    /**
     * 订单编号
     */
    private String code;

    /**
     * 0 正常 1 星标
     */
    private String star;

    /**
     * 金额
     */
    private String money;

    /**
     * 支付方式 1 支付宝 2 微信
     */
    private String payment;

    /**
     * 订单状态0 已取消 1 待付款 2待发货 3待收货 4待评价 5已完成 6申请退款 7退款成功
     */
    private String state;

    /**
     * 备注
     */
    private String remark;

    /**
     * 收件地址
     */
    private String address;

    /**
     * 收件人名字
     */
    private String addressee;

    /**
     * 收件人手机号
     */
    private String addresseeTel;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date shipmentsTime;

    /**
     * 收货时间
     */
    private Date receivingTime;

    /**
     * 评论
     */
    private String comment;

    /**
     * 快递公司
     */
    private String express;

    /**
     * 快递单号
     */
    private String expressNo;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getAddresseeTel() {
        return addresseeTel;
    }

    public void setAddresseeTel(String addresseeTel) {
        this.addresseeTel = addresseeTel;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getShipmentsTime() {
        return shipmentsTime;
    }

    public void setShipmentsTime(Date shipmentsTime) {
        this.shipmentsTime = shipmentsTime;
    }

    public Date getReceivingTime() {
        return receivingTime;
    }

    public void setReceivingTime(Date receivingTime) {
        this.receivingTime = receivingTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
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
        Order other = (Order) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getStar() == null ? other.getStar() == null : this.getStar().equals(other.getStar()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAddressee() == null ? other.getAddressee() == null : this.getAddressee().equals(other.getAddressee()))
            && (this.getAddresseeTel() == null ? other.getAddresseeTel() == null : this.getAddresseeTel().equals(other.getAddresseeTel()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getShipmentsTime() == null ? other.getShipmentsTime() == null : this.getShipmentsTime().equals(other.getShipmentsTime()))
            && (this.getReceivingTime() == null ? other.getReceivingTime() == null : this.getReceivingTime().equals(other.getReceivingTime()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getExpress() == null ? other.getExpress() == null : this.getExpress().equals(other.getExpress()))
            && (this.getExpressNo() == null ? other.getExpressNo() == null : this.getExpressNo().equals(other.getExpressNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getStar() == null) ? 0 : getStar().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAddressee() == null) ? 0 : getAddressee().hashCode());
        result = prime * result + ((getAddresseeTel() == null) ? 0 : getAddresseeTel().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getShipmentsTime() == null) ? 0 : getShipmentsTime().hashCode());
        result = prime * result + ((getReceivingTime() == null) ? 0 : getReceivingTime().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getExpress() == null) ? 0 : getExpress().hashCode());
        result = prime * result + ((getExpressNo() == null) ? 0 : getExpressNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", star=").append(star);
        sb.append(", money=").append(money);
        sb.append(", payment=").append(payment);
        sb.append(", state=").append(state);
        sb.append(", remark=").append(remark);
        sb.append(", address=").append(address);
        sb.append(", addressee=").append(addressee);
        sb.append(", addresseeTel=").append(addresseeTel);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", shipmentsTime=").append(shipmentsTime);
        sb.append(", receivingTime=").append(receivingTime);
        sb.append(", comment=").append(comment);
        sb.append(", express=").append(express);
        sb.append(", expressNo=").append(expressNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}