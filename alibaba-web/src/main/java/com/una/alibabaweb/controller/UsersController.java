package com.una.alibabaweb.controller;

import com.una.alibabacommon.ResponseView;
import com.una.alibabacommon.page.MyIPage;
import com.una.alibabacommon.page.MybatisPlusPage;
import com.una.alibabausers.RpcUsersService;
import com.una.alibabausers.dto.UsersDTO;
import com.una.alibabausers.dto.UsersFansDTO;
import com.una.alibabausers.vo.UsersFollowVO;
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

    /**
     * 分页查询用户
     *
     * @param mybatisPlusPage 分页信息
     * @return {@link ResponseView<MyIPage<UsersVO>> }
     * @author Una Ma
     * @date 2020/01/29 14:11:39
     * @description 页面内容
     * @status 已发布
     */
    @PostMapping(value = "/pageUsers")
    public ResponseView<MyIPage<UsersVO>> pageContents(@RequestBody MybatisPlusPage<UsersDTO> mybatisPlusPage) {
        return ResponseView.success(rpcUsersService.pageUsers(mybatisPlusPage));
    }

    /**
     * 获取用户的粉丝
     *
     * @param mybatisPlusPage 分页参数
     * @return {@link ResponseView<MyIPage<UsersVO>> }
     * @author Una Ma
     * @date 2020/01/29 14:13:17
     * @description 得到用户的粉丝
     * @status 已发布
     */
    @PostMapping(value = "/getUsersFans")
    public ResponseView<MyIPage<UsersFollowVO>> getUsersFans(@RequestBody MybatisPlusPage<UsersFansDTO> mybatisPlusPage){
        return ResponseView.success(rpcUsersService.getUsersFans(mybatisPlusPage));
    }

}
