package com.ant.app.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * user_invite_log
 * @author 
 */
public class UserInviteLog implements Serializable {
    private Integer id;

    /**
     * 邀请者id
     */
    private Integer inviterId;

    /**
     * 被邀请者id
     */
    private Integer inviteeId;

    /**
     * 邀请时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInviterId() {
        return inviterId;
    }

    public void setInviterId(Integer inviterId) {
        this.inviterId = inviterId;
    }

    public Integer getInviteeId() {
        return inviteeId;
    }

    public void setInviteeId(Integer inviteeId) {
        this.inviteeId = inviteeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}