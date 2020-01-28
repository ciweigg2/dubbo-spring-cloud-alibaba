package com.una.alibabausers.mybatis.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *${description}
 *@author Una Ma
 *@date 2020/1/28 11:31 下午
 *@menu ${description}
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "users_follow")
public class UsersFollow implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 关注用户
     */
    @TableField(value = "source_uid")
    private Long sourceUid;

    /**
     * 被关注用户
     */
    @TableField(value = "target_uid")
    private Long targetUid;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SOURCE_UID = "source_uid";

    public static final String COL_TARGET_UID = "target_uid";

    public static final String COL_CREATE_TIME = "create_time";
}