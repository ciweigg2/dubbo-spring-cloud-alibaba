package com.una.alibabausers;

import com.una.alibabausers.mybatis.model.Users;

/**
 * @author Una Ma
 * @className RpcUsersService
 * @description
 * @date 2020/1/27 7:01 下午
 */
public interface RpcUsersService {

    /**
     * 根据用户id查询用户
     * @param uid 用户id
     * @return 用户
     */
    Users getUsersByUid(int uid);

}
