CREATE TABLE `articles`  (
  `aid` int(0) NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `uid` int(0) NOT NULL COMMENT '用户id',
  `article_name` varchar(255) NULL COMMENT '文章名称',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`aid`)
) COMMENT = '文章表';

CREATE TABLE `users`  (
  `uid` int(0) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) NULL COMMENT '用户名',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`uid`)
) COMMENT = '用户表';

