package com.una.alibabaarticles.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.alibabaarticles.RpcContentService;
import com.una.alibabaarticles.mybatis.model.Content;
import com.una.alibabaarticles.mybatis.service.ContentService;
import com.una.alibabacommon.page.MybatisPlusPage;
import com.una.alibabausers.RpcUsersService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Una Ma
 * @className ArticlesServiceImpl
 * @description 文章接口实现类
 * @date 2020/1/27 3:39 下午
 */
@Service
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

}
