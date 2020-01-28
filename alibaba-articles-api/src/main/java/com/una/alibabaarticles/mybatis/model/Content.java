package com.una.alibabaarticles.mybatis.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *${description}
 *@author Una Ma
 *@date 2020/1/28 11:30 下午
 *@menu ${description}
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "content")
public class Content implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户
     */
    @TableField(value = "uid")
    private Long uid;

    @TableField(value = "forward_cid")
    private Long forwardCid;

    @TableField(value = "title")
    private String title;

    /**
     * 写文章的感受标签
     */
    @TableField(value = "feeling")
    private String feeling;

    /**
     * 0 原生内容，1 转发原生UGC内容,2小编内容 3，直播，4 活动，5系统,6转发直播，7转发活动,8转发小编文章,9转发系统文章
     */
    @TableField(value = "type")
    private Integer type;

    @TableField(value = "conver_image")
    private String converImage;

    @TableField(value = "forward_title")
    private String forwardTitle;

    @TableField(value = "forward_url")
    private String forwardUrl;

    @TableField(value = "content_type")
    private Integer contentType;

    /**
     * 内容
     */
    @TableField(value = "content")
    private String content;

    @TableField(value = "thumbnail")
    private String thumbnail;

    /**
     * 默认热度为1
     */
    @TableField(value = "hot_value")
    private Integer hotValue;

    /**
     * 参与人数
     */
    @TableField(value = "person_count")
    private Integer personCount;

    /**
     * 评论数
     */
    @TableField(value = "review_count")
    private Integer reviewCount;

    @TableField(value = "like_count")
    private Integer likeCount;

    @TableField(value = "favorite_count")
    private Integer favoriteCount;

    @TableField(value = "read_count")
    private Integer readCount;

    /**
     * 虚拟阅读数
     */
    @TableField(value = "read_count_dummy")
    private Integer readCountDummy;

    /**
     * 是否置顶
     */
    @TableField(value = "is_top")
    private Integer isTop;

    /**
     * 阅读权限 0所有，1自己，2亲密
     */
    @TableField(value = "authorization")
    private Integer authorization;

    /**
     * 0仅自己，1公开
     */
    @TableField(value = "rights")
    private Integer rights;

    /**
     * 0用户1表示小编
     */
    @TableField(value = "author")
    private Integer author;

    /**
     * 0正常，1删除,2可恢复状态
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_UID = "uid";

    public static final String COL_FORWARD_CID = "forward_cid";

    public static final String COL_TITLE = "title";

    public static final String COL_FEELING = "feeling";

    public static final String COL_TYPE = "type";

    public static final String COL_CONVER_IMAGE = "conver_image";

    public static final String COL_FORWARD_TITLE = "forward_title";

    public static final String COL_FORWARD_URL = "forward_url";

    public static final String COL_CONTENT_TYPE = "content_type";

    public static final String COL_CONTENT = "content";

    public static final String COL_THUMBNAIL = "thumbnail";

    public static final String COL_HOT_VALUE = "hot_value";

    public static final String COL_PERSON_COUNT = "person_count";

    public static final String COL_REVIEW_COUNT = "review_count";

    public static final String COL_LIKE_COUNT = "like_count";

    public static final String COL_FAVORITE_COUNT = "favorite_count";

    public static final String COL_READ_COUNT = "read_count";

    public static final String COL_READ_COUNT_DUMMY = "read_count_dummy";

    public static final String COL_IS_TOP = "is_top";

    public static final String COL_AUTHORIZATION = "authorization";

    public static final String COL_RIGHTS = "rights";

    public static final String COL_AUTHOR = "author";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";
}