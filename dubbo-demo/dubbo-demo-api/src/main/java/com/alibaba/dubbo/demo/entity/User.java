package com.alibaba.dubbo.demo.entity;

import javax.validation.constraints.NotNull;

public class User {

    @NotNull(message = "用户名不能为空")
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

}