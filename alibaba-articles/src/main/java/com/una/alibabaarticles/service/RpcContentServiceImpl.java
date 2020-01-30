package com.una.alibabaarticles.service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.alibabaarticles.RpcContentService;
import com.una.alibabaarticles.mybatis.model.Content;
import com.una.alibabaarticles.mybatis.service.ContentService;
import com.una.alibabacommon.page.MybatisPlusPage;
import com.una.alibabausers.RpcUsersService;
import com.una.alibabausers.mybatis.model.UsersFollow;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author Una Ma
 * @className ArticlesServiceImpl
 * @description 文章接口实现类
 * @date 2020/1/27 3:39 下午
 */
@Service
@Transactional
public class RpcContentServiceImpl implements RpcContentService {

    @Autowired
    private ContentService contentService;

    @Reference
    private RpcUsersService rpcUsersService;

    @Override
    public Page<Content> pageContents(MybatisPlusPage<Content> mybatisPlusPage) {
        QueryWrapper<Content> wrapper = new QueryWrapper();
        //根据不为空的字段查询
        wrapper.setEntity(mybatisPlusPage.getObject());
        Page<Content> page = new Page<>(mybatisPlusPage.getCurrent() ,mybatisPlusPage.getSize());
        return contentService.page(page ,wrapper);
    }

    @Override
    @GlobalTransactional
    public boolean insertContent() {
        //调用远程服务
        UsersFollow usersFollow = new UsersFollow();
        usersFollow.setId(0L);
        usersFollow.setSourceUid(0L);
        usersFollow.setTargetUid(0L);
        usersFollow.setCreateTime(new Date());
        rpcUsersService.insertUsersFollow(usersFollow);
        //调用本地服务
        Content content = new Content();
        content.setId(0);
        content.setUid(0L);
        content.setForwardCid(0L);
        content.setTitle("");
        content.setFeeling("");
        content.setType(0);
        content.setConverImage("");
        content.setForwardTitle("");
        content.setForwardUrl("");
        content.setContentType(0);
        content.setContent("");
        content.setThumbnail("");
        content.setHotValue(0);
        content.setPersonCount(0);
        content.setReviewCount(0);
        content.setLikeCount(0);
        content.setFavoriteCount(0);
        content.setReadCount(0);
        content.setReadCountDummy(0);
        content.setIsTop(0);
        content.setAuthorization(0);
        content.setRights(0);
        content.setAuthor(0);
        content.setStatus(0);
        content.setCreateTime(new Date());
        contentService.save(content);
        //模拟调用本地服务报错 事务全部回滚
        int i = 1/0;
        return true;
    }

}
