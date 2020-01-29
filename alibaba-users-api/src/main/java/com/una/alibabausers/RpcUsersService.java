package com.una.alibabausers;

import com.una.alibabacommon.ResponseView;
import com.una.alibabacommon.page.MybatisPlusPage;
import com.una.alibabausers.dto.UsersDTO;

/**
 * @author Una Ma
 * @className RpcUsersService
 * @description
 * @date 2020/1/27 7:01 下午
 */
public interface RpcUsersService {

    ResponseView pageUsers(MybatisPlusPage<UsersDTO> mybatisPlusPage);

}
