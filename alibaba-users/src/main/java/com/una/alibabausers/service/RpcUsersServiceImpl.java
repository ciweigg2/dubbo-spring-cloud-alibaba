package com.una.alibabausers.service;

import com.una.alibabausers.RpcUsersService;
import com.una.alibabausers.mybatis.model.Users;
import com.una.alibabausers.mybatis.service.UsersService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Una Ma
 * @className UsersServiceImpl
 * @description 用户接口实现类
 * @date 2020/1/27 3:42 下午
 */
@Service
public class RpcUsersServiceImpl implements RpcUsersService {

    @Autowired
    private UsersService usersService;

    /**
     * 根据用户id查询用户
     *
     * @param uid 用户id
     * @return 用户
     */
    @Override
    public Users getUsersByUid(int uid) {
        return usersService.getById(uid);
    }

}
