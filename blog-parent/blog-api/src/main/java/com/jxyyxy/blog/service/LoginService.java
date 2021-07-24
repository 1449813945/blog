package com.jxyyxy.blog.service;

import com.jxyyxy.blog.entity.SysUser;
import com.jxyyxy.blog.vo.Result;
import com.jxyyxy.blog.vo.params.LoginParam;

public interface LoginService {
    /**
     * 登录功能
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    Result logout(String token);

    Result register(LoginParam loginParam);
}