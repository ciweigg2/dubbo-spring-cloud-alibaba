package com.una.alibabausers.vo;

import com.diboot.core.binding.annotation.BindField;
import com.una.alibabausers.mybatis.model.UsersProfile;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户关注信息
 *
 * @author Una Ma
 * @date 2020/1/29 2:15 下午
 * @menu 用户关注信息
 */
@Data
public class UsersFansVO implements Serializable {

    /**
     * 用户id
     */
    private long uid;

    /**
     * 用户头像
     */
    @BindField(entity = UsersProfile.class, field = UsersProfile.COL_AVATAR, condition = "this.source_uid = uid")
    private String avatar;

    /**
     * 用户昵称
     */
    @BindField(entity = UsersProfile.class, field = UsersProfile.COL_NICK_NAME, condition = "this.source_uid = uid")
    private String nickName;

    /**
     * 我是否关注
     */
    private int isFollowed;

    /**
     * 是否关注我
     */
    private int isFollowMe;

    /**
     * 关注用户
     */
    private Long sourceUid;

    /**
     * 被关注用户
     */
    private Long targetUid;

}
