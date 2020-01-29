package com.una.alibabaweb.controller;

import com.una.alibabacommon.ResponseView;
import com.una.alibabacommon.page.MyIPage;
import com.una.alibabacommon.page.MybatisPlusPage;
import com.una.alibabausers.RpcUsersService;
import com.una.alibabausers.dto.UsersDTO;
import com.una.alibabausers.vo.UsersVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务接口
 *
 * @author Una Ma
 * @date 2020/1/29 11:04 上午
 * @menu 用户服务接口
 */
@RestController
@RequestMapping(value = "/users")
public class UsersController {

    @Reference
    private RpcUsersService rpcUsersService;

    @PostMapping(value = "/pageUsers")
    public ResponseView<MyIPage<UsersVO>> pageContents(@RequestBody MybatisPlusPage<UsersDTO> mybatisPlusPage) {
        return ResponseView.success(rpcUsersService.pageUsers(mybatisPlusPage));
    }

}
