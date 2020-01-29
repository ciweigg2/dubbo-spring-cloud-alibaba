package com.una.alibabausers.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.diboot.core.binding.QueryBuilder;
import com.diboot.core.binding.RelationsBinder;
import com.una.alibabacommon.ResponseView;
import com.una.alibabacommon.page.MybatisPlusPage;
import com.una.alibabausers.RpcUsersService;
import com.una.alibabausers.dto.UsersDTO;
import com.una.alibabausers.mybatis.model.Users;
import com.una.alibabausers.mybatis.service.UsersProfileService;
import com.una.alibabausers.mybatis.service.UsersService;
import com.una.alibabausers.vo.UsersVO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    @Autowired
    private UsersProfileService usersProfileService;

    @Override
    public ResponseView pageUsers(MybatisPlusPage<UsersDTO> mybatisPlusPage) {
        // DTO转换为QueryWrapper，若无@BindQuery注解默认映射为等于=条件，有注解映射为注解条件。
        QueryWrapper<Users> queryWrapper = QueryBuilder.toQueryWrapper(mybatisPlusPage.getObject());
        // 查询当前页的Entity主表数据
        Page<Users> page = new Page<>(mybatisPlusPage.getCurrent(), mybatisPlusPage.getSize());
        //排序
        page.setOrders(mybatisPlusPage.getOrders());
        Page<Users> usersProfilePage = usersService.page(page, queryWrapper);
        // 自动转换VO中注解绑定的关联
        List<UsersVO> voList = RelationsBinder.convertAndBind(usersProfilePage.getRecords(), UsersVO.class);
        return ResponseView.success(voList).bindPagination(page);
    }

}
