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
@TableName(value = "users_profile")
public class UsersProfile implements Serializable {
    /**
     * 主键，自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "uid")
    private Long uid;

    /**
     * 用户手机号码
     */
    @TableField(value = "mobile")
    private String mobile;

    /**
     * 用户昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 性别，0女1男
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    private String birthday;

    /**
     * 用户头像
     */
    @TableField(value = "avatar")
    private String avatar;

    /**
     * 年代情怀
     */
    @TableField(value = "years_id")
    private Long yearsId;

    /**
     * 星座
     */
    @TableField(value = "star_id")
    private Long starId;

    /**
     * 社会阶层
     */
    @TableField(value = "social_class")
    private Long socialClass;

    /**
     * 所属行业
     */
    @TableField(value = "industry")
    private Long industry;

    /**
     * 婚恋状态
     */
    @TableField(value = "marriage_status")
    private Long marriageStatus;

    /**
     * 生育状态
     */
    @TableField(value = "bear_status")
    private Long bearStatus;

    /**
     * 0 普通 1 大V
     */
    @TableField(value = "excellent")
    private Integer excellent;

    @TableField(value = "introduced")
    private String introduced;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 是否是推广员 0 否 1是
     */
    @TableField(value = "is_promoter")
    private Integer isPromoter;

    /**
     * 是否激活 0未激活 1激活
     */
    @TableField(value = "is_activate")
    private Integer isActivate;

    /**
     * 推广者uid
     */
    @TableField(value = "referee_uid")
    private Integer refereeUid;

    @TableField(value = "qrcode")
    private String qrcode;

    @TableField(value = "third_part_bind")
    private String thirdPartBind;

    /**
     * 是否是大V(0 否 1 是)
     */
    @TableField(value = "v_lv")
    private Integer vLv;

    /**
     * 是否在客户端登录过，1否，0是
     */
    @TableField(value = "is_client_login")
    private Integer isClientLogin;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_UID = "uid";

    public static final String COL_MOBILE = "mobile";

    public static final String COL_NICK_NAME = "nick_name";

    public static final String COL_GENDER = "gender";

    public static final String COL_BIRTHDAY = "birthday";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_YEARS_ID = "years_id";

    public static final String COL_STAR_ID = "star_id";

    public static final String COL_SOCIAL_CLASS = "social_class";

    public static final String COL_INDUSTRY = "industry";

    public static final String COL_MARRIAGE_STATUS = "marriage_status";

    public static final String COL_BEAR_STATUS = "bear_status";

    public static final String COL_EXCELLENT = "excellent";

    public static final String COL_INTRODUCED = "introduced";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_IS_PROMOTER = "is_promoter";

    public static final String COL_IS_ACTIVATE = "is_activate";

    public static final String COL_REFEREE_UID = "referee_uid";

    public static final String COL_QRCODE = "qrcode";

    public static final String COL_THIRD_PART_BIND = "third_part_bind";

    public static final String COL_V_LV = "v_lv";

    public static final String COL_IS_CLIENT_LOGIN = "is_client_login";
}