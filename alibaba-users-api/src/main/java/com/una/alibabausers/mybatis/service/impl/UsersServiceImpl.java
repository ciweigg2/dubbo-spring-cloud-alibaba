package com.una.alibabausers.mybatis.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.una.alibabausers.mybatis.mapper.UsersMapper;
import com.una.alibabausers.mybatis.model.Users;
import com.una.alibabausers.mybatis.service.UsersService;
/**
 *${description}
 *@author Una Ma
 *@date 2020/1/28 11:31 下午
 *@menu ${description}
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService{

}
