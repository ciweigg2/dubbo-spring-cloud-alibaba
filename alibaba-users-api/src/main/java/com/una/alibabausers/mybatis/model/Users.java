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
@TableName(value = "users")
public class Users implements Serializable {
    /**
     * 用户编号 主键
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Long uid;

    /**
     * 账号
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField(value = "encrypt")
    private String encrypt;

    /**
     * 盐
     */
    @TableField(value = "salt")
    private String salt;

    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 0 注册用户 1 游客
     */
    @TableField(value = "touristType")
    private Integer touristtype;

    /**
     * 0 正常 1 禁用
     */
    @TableField(value = "disable_user")
    private Integer disableUser;

    private static final long serialVersionUID = 1L;

    public static final String COL_UID = "uid";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_ENCRYPT = "encrypt";

    public static final String COL_SALT = "salt";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_STATUS = "status";

    public static final String COL_TOURISTTYPE = "touristType";

    public static final String COL_DISABLE_USER = "disable_user";
}