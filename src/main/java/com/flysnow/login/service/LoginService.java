package com.flysnow.login.service;

import com.flysnow.login.model.LoginUser;

import java.util.Date;

public interface LoginService {

    /**
     * 登录
     *
     * @param userAccount 用户账号
     * @param password    密码
     * @param password    令牌
     * @return
     */
    LoginUser login(String userAccount, String password, String token);


    void insertLoginlog(LoginUser loginUser, String loginType);

}
