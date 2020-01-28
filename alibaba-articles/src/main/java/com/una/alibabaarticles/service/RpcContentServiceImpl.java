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

//    @Override
//    public ResponseView getArticlesAndUsers(MybatisPlusPage<ArticlesDTO> mybatisPlusPage) {
//        // DTO转换为QueryWrapper，若无@BindQuery注解默认映射为等于=条件，有注解映射为注解条件。
//        QueryWrapper<Articles> queryWrapper = QueryBuilder.toQueryWrapper(mybatisPlusPage.getObject());
//        // 查询当前页的Entity主表数据
//        Page<Articles> page = new Page<>(mybatisPlusPage.getCurrent(), mybatisPlusPage.getSize());
//        //排序
//        page.setOrders(mybatisPlusPage.getOrders());
//        Page<Articles> businessLicensePage = articlesService.page(page, queryWrapper);
//        // 自动转换VO中注解绑定的关联
//        List<ArticlesVO> voList = RelationsBinder.convertAndBind(businessLicensePage.getRecords(), ArticlesVO.class);
//        return ResponseView.success(voList).bindPagination(page);
//    }

    @Override
    public Page<Content> pageContents(MybatisPlusPage<Content> mybatisPlusPage) {
        QueryWrapper<Content> wrapper = new QueryWrapper();
        //根据不为空的字段查询
        wrapper.setEntity(mybatisPlusPage.getObject());
        Page<Content> page = new Page<>(mybatisPlusPage.getCurrent() ,mybatisPlusPage.getSize());
        return contentService.page(page ,wrapper);
    }

}
