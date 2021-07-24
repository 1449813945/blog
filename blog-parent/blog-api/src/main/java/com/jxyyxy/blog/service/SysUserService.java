package com.jxyyxy.blog.service;

import com.jxyyxy.blog.entity.SysUser;
import com.jxyyxy.blog.vo.Result;
import com.jxyyxy.blog.vo.UserVo;

public interface SysUserService {

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    /**
     * 根据token查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    UserVo findUserVoById(Long id);
}
