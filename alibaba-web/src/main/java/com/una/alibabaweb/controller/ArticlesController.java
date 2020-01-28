package com.una.alibabaweb.controller;

import com.una.alibabaarticles.RpcArticlesService;
import com.una.alibabaarticles.mybatis.model.Articles;
import com.una.alibabacommon.ResponseView;
import com.una.alibabacommon.page.MyIPage;
import com.una.alibabacommon.page.MybatisPlusPage;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章获取
 *
 * @author Una Ma
 * @date 2020/1/27 4:00 下午
 * @menu 文章获取
 */
@RestController
@RequestMapping(value = "/articles")
public class ArticlesController {

    @Reference
    public RpcArticlesService rpcArticlesService;

    @RequestMapping(value = "/getArticlesAndUsers")
    public void getArticlesAndUsers(){
        System.out.println(rpcArticlesService.getArticlesAndUsers());
    }

    @PostMapping(value = "/pageArticles")
    public ResponseView<MyIPage<Articles>> pageArticles(@RequestBody MybatisPlusPage<Articles> mybatisPlusPage) {
        return ResponseView.success(rpcArticlesService.pageArticles(mybatisPlusPage));
    }

}
