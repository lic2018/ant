package com.ant.app.entity;

import java.io.Serializable;

/**
 * app_configure
 * @author 
 */
public class AppConfigure implements Serializable {
    private Integer id;

    private String name;

    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}