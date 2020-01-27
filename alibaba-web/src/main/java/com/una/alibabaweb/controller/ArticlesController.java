package com.una.alibabaweb.controller;

import com.una.alibabaarticles.RpcArticlesService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Una Ma
 * @className ArticlesController
 * @description 文章获取
 * @date 2020/1/27 4:00 下午
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

}
