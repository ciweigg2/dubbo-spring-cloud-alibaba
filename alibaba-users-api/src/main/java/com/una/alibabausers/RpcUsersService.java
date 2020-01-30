package com.una.alibabausers;

import com.una.alibabacommon.ResponseView;
import com.una.alibabacommon.page.MybatisPlusPage;
import com.una.alibabausers.dto.UsersDTO;
import com.una.alibabausers.dto.UsersFansDTO;
import com.una.alibabausers.mybatis.model.UsersFollow;

/**
 * @author Una Ma
 * @className RpcUsersService
 * @description
 * @date 2020/1/27 7:01 下午
 */
public interface RpcUsersService {

    ResponseView pageUsers(MybatisPlusPage<UsersDTO> mybatisPlusPage);

    ResponseView getUsersFans(MybatisPlusPage<UsersFansDTO> mybatisPlusPage);

    boolean insertUsersFollow(UsersFollow usersFollow);

}
