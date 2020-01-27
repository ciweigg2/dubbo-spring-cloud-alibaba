package com.una.alibabaarticles.mybatis.model;

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
 *@className Articles
 *@description
 *@author Una Ma
 *@date 2020/1/27 7:02 下午
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "articles")
public class Articles implements Serializable {
    /**
     * 文章id
     */
    @TableId(value = "aid", type = IdType.AUTO)
    private Integer aid;

    /**
     * 用户id
     */
    @TableField(value = "uid")
    private Integer uid;

    /**
     * 文章名称
     */
    @TableField(value = "article_name")
    private String articleName;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_AID = "aid";

    public static final String COL_UID = "uid";

    public static final String COL_ARTICLE_NAME = "article_name";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}