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
 *${description}
 *@author Una Ma
 *@date 2020/1/28 11:30 下午
 *@menu ${description}
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "content_user_likes")
public class ContentUserLikes implements Serializable {
    /**
     * 用户点赞
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章id
     */
    @TableField(value = "cid")
    private Long cid;

    @TableField(value = "tag_id")
    private Long tagId;

    /**
     * 用户uid
     */
    @TableField(value = "uid")
    private Integer uid;

    /**
     * 点赞时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CID = "cid";

    public static final String COL_TAG_ID = "tag_id";

    public static final String COL_UID = "uid";

    public static final String COL_CREATE_TIME = "create_time";
}