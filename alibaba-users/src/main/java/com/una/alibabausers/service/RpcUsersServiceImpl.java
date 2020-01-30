package com.una.alibabausers.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.diboot.core.binding.QueryBuilder;
import com.diboot.core.binding.RelationsBinder;
import com.google.common.base.Preconditions;
import com.una.alibabacommon.ResponseView;
import com.una.alibabacommon.page.MybatisPlusPage;
import com.una.alibabausers.RpcUsersService;
import com.una.alibabausers.dto.UsersDTO;
import com.una.alibabausers.dto.UsersFansDTO;
import com.una.alibabausers.mybatis.model.Users;
import com.una.alibabausers.mybatis.model.UsersFollow;
import com.una.alibabausers.mybatis.service.UsersFollowService;
import com.una.alibabausers.mybatis.service.UsersService;
import com.una.alibabausers.vo.UsersFansVO;
import com.una.alibabausers.vo.UsersVO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Una Ma
 * @className UsersServiceImpl
 * @description 用户接口实现类
 * @date 2020/1/27 3:42 下午
 */
@Service
@Transactional
public class RpcUsersServiceImpl implements RpcUsersService {

    @Autowired
    private UsersService usersService;

    @Autowired
    private UsersFollowService usersFollowService;

    @Override
    public ResponseView pageUsers(MybatisPlusPage<UsersDTO> mybatisPlusPage) {
        // DTO转换为QueryWrapper，若无@BindQuery注解默认映射为等于=条件，有注解映射为注解条件。
        QueryWrapper<Users> queryWrapper = QueryBuilder.toQueryWrapper(mybatisPlusPage.getObject());
        // 设置分页
        Page<Users> page = new Page<>(mybatisPlusPage.getCurrent(), mybatisPlusPage.getSize());
        //排序
        page.setOrders(mybatisPlusPage.getOrders());
        Page<Users> usersProfilePage = usersService.page(page, queryWrapper);
        // 自动转换VO中注解绑定的关联
        List<UsersVO> voList = RelationsBinder.convertAndBind(usersProfilePage.getRecords(), UsersVO.class);
        return ResponseView.success(voList).bindPagination(page);
    }

    @Override
    public ResponseView getUsersFans(MybatisPlusPage<UsersFansDTO> mybatisPlusPage) {
        //查询粉丝
        UsersFansDTO usersFansDTO = mybatisPlusPage.getObject();
        Preconditions.checkArgument(usersFansDTO.getUid() != null ,"用户id不能为空");
        //所有关注我的
        LambdaQueryWrapper<UsersFollow> queryWrapper = new LambdaQueryWrapper<UsersFollow>()
                .eq(UsersFollow::getTargetUid ,usersFansDTO.getUid());
        // 设置分页
        Page<UsersFollow> page = new Page<>(mybatisPlusPage.getCurrent(), mybatisPlusPage.getSize());
        Page<UsersFollow> usersFollowList = usersFollowService.page(page ,queryWrapper);
        // 自动转换VO中注解绑定的关联
        List<UsersFansVO> usersFansVOList = RelationsBinder.convertAndBind(usersFollowList.getRecords(), UsersFansVO.class);
        for(UsersFansVO usersFansVO : usersFansVOList){
            usersFansVO.setUid(usersFansVO.getSourceUid());
            //查询我是否关注
            int followed = this.isFollow(usersFansDTO.getUid() ,usersFansVO.getSourceUid());
            usersFansVO.setIsFollowed(followed);
            //查询是否关注我 因为上面查询的列表就是关注我的 所以设置1
            usersFansVO.setIsFollowMe(1);
        }
        return ResponseView.success(usersFansVOList).bindPagination(page);
    }

    /**
     * 查询关注信息
     * @param sourceUid 发起关注id
     * @param targetUid 被关注id
     * @return 0未关注 1关注
     */
    public int isFollow(long sourceUid,long targetUid){
        LambdaQueryWrapper lambdaQueryWrapper = new LambdaQueryWrapper<UsersFollow>()
                .eq(UsersFollow::getSourceUid ,sourceUid)
                .eq(UsersFollow::getTargetUid ,targetUid);
        UsersFollow usersFollow = usersFollowService.getOne(lambdaQueryWrapper);
        if(usersFollow == null){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public boolean insertUsersFollow(UsersFollow usersFollow) {
        return usersFollowService.save(usersFollow);
    }

}
