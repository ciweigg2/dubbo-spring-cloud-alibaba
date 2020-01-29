package com.una.alibabausers.vo;

import com.diboot.core.binding.annotation.BindEntity;
import com.una.alibabausers.mybatis.model.Users;
import com.una.alibabausers.mybatis.model.UsersFollow;
import com.una.alibabausers.mybatis.model.UsersProfile;
import lombok.Data;

/**
 * 用户信息对象
 *
 * @author Una Ma
 * @date 2020/1/29 11:11 上午
 * @menu 用户信息对象
 */
@Data
public class UsersVO extends Users {

    /**
     * 用户详细信息 uid指集成的entity里面的对象表字段 this是指当前集成的users对象表字段
     */
    @BindEntity(entity = UsersProfile.class, condition = "this.uid = uid")
    private UsersProfile usersProfile;

    /**
     * 测试返回所需要的字段
     */
    @BindEntity(entity = UsersFollow.class, condition = "this.uid = source_uid")
    private UsersFollowVO usersFollow;

}
