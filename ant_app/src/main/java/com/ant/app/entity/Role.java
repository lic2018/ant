package com.ant.app.entity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * p_role
 * @author 
 */
public class Role implements Serializable {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 服务客户UUID
     */
    private String objectUuid;

    /**
     * 角色编号
     */
    private String rolecode;

    /**
     * 角色名称
     */
    @NotNull
    private String rolename;

    /**
     * 描述
     */
    private String description;

    /**
     * 拥有权限   用英文逗号,隔开
     */
    private String moduleIds;

    private String appModuleIds;

    /**
     * 是否删除 0删除 1正常
     */
    private String isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近一次修改时间
     */
    private Date modifyTime;

    private String isLogin;

    /**
     * 创建者uuid
     */
    private String creatorUuid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjectUuid() {
        return objectUuid;
    }

    public void setObjectUuid(String objectUuid) {
        this.objectUuid = objectUuid;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(String moduleIds) {
        this.moduleIds = moduleIds;
    }

    public String getAppModuleIds() {
        return appModuleIds;
    }

    public void setAppModuleIds(String appModuleIds) {
        this.appModuleIds = appModuleIds;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin;
    }

    public String getCreatorUuid() {
        return creatorUuid;
    }

    public void setCreatorUuid(String creatorUuid) {
        this.creatorUuid = creatorUuid;
    }
}