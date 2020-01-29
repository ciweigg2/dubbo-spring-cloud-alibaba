package com.una.alibabausers.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 测试返回所需要的字段
 *
 * @author Una Ma
 * @date 2020/1/29 2:01 下午
 * @menu 测试返回所需要的字段
 */
@Data
public class UsersFollowVO implements Serializable {

    /**
     * 关注用户
     */
    private Long sourceUid;

    /**
     * 被关注用户
     */
    private Long targetUid;

    /**
     * 创建时间
     */
    private Date createTime;

}
