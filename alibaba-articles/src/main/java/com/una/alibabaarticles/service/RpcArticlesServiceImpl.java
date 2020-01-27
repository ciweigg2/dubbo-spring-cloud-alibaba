package com.una.alibabaarticles.service;

import com.una.alibabaarticles.RpcArticlesService;
import com.una.alibabaarticles.mybatis.model.Articles;
import com.una.alibabaarticles.mybatis.service.ArticlesService;
import com.una.alibabausers.RpcUsersService;
import com.una.alibabausers.mybatis.model.Users;
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
public class RpcArticlesServiceImpl implements RpcArticlesService {

    @Autowired
    private ArticlesService articlesService;

    @Reference
    private RpcUsersService rpcUsersService;

    @Override
    public Articles getArticlesAndUsers() {
        Articles articles = articlesService.getOne(null);
        if (articles != null) {
            Users users = rpcUsersService.getUsersByUid(articles.getUid());
            System.out.println(users);
        }
        return articles;
    }

}
