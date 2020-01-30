package com.una.alibabaarticles;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.una.alibabaarticles.mybatis.model.Content;
import com.una.alibabacommon.page.MybatisPlusPage;

/**
 * @author Una Ma
 * @className RpcArticlesService
 * @description 文章接口服务
 * @date 2020/1/27 6:54 下午
 */
public interface RpcContentService {

    Page<Content> pageContents(MybatisPlusPage<Content> mybatisPlusPage);

    boolean insertContent();

}
