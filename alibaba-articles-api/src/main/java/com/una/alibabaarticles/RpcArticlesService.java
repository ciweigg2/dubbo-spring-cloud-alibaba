package com.una.alibabaarticles;

import com.una.alibabaarticles.mybatis.model.Articles;

/**
 * @author Una Ma
 * @className RpcArticlesService
 * @description 文章接口服务
 * @date 2020/1/27 6:54 下午
 */
public interface RpcArticlesService {

    Articles getArticlesAndUsers();

}
