package com.v.model;

import java.io.Serializable;


/**
 *
 *
 *
 **/
@SuppressWarnings("serial")
public class User implements Serializable {

    /****/
    private Integer id;

    /****/
    private String username;

    /****/
    private String password;

    /**
     * 邮箱
     **/
    private String email;

    /**
     * 电话
     **/
    private String phone;

    /**
     * 备注
     **/
    private String msg;

    /**
     * 图片
     **/
    private String pic;

    /**
     * 地址
     **/
    private String address;

    /****/
    private Integer isDelete;

    /****/
    private String createTime;

    /****/
    private String updateTime;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return this.pic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

}
