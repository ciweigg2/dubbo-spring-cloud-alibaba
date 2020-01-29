package com.una.alibabausers.dto;

import com.diboot.core.binding.query.BindQuery;
import com.diboot.core.binding.query.Comparison;
import com.una.alibabausers.mybatis.model.Users;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户查询对象
 *
 * @author Una Ma
 * @date 2020/1/29 11:09 上午
 * @menu 用户查询对象
 */
@Data
public class UsersDTO implements Serializable {

    /**
     * 用户账号 根据field查询的 变量名可以随意取的
     */
    @BindQuery(comparison = Comparison.LIKE ,field = Users.COL_USER_NAME)
    private String userName;

}
