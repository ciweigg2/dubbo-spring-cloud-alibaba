package com.una.alibabausers.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户粉丝查询对象
 *
 * @author Una Ma
 * @date 2020/1/29 2:20 下午
 * @menu 用户粉丝查询对象
 */
@Data
public class UsersFansDTO implements Serializable {

    /**
     * 当前用户id
     */
    private Long uid;

}
