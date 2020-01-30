package com.una.alibabaweb.controller;

import com.una.alibabaarticles.RpcContentService;
import com.una.alibabaarticles.mybatis.model.Content;
import com.una.alibabacommon.ResponseView;
import com.una.alibabacommon.page.MyIPage;
import com.una.alibabacommon.page.MybatisPlusPage;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章服务接口
 *
 * @author Una Ma
 * @date 2020/1/27 4:00 下午
 * @menu 文章服务接口
 */
@RestController
@RequestMapping(value = "/content")
public class ContentController {

    @Reference
    public RpcContentService rpcContentService;

    /**
     * 分页查询文章
     *
     * @param mybatisPlusPage 分页信息
     * @return {@link ResponseView<MyIPage<Content>> }
     * @author Una Ma
     * @date 2020/01/29 11:05:56
     * @description 分页查询文章
     * @status 已发布
     */
    @PostMapping(value = "/pageContents")
    public ResponseView<MyIPage<Content>> pageContents(@RequestBody MybatisPlusPage<Content> mybatisPlusPage) {
        return ResponseView.success(rpcContentService.pageContents(mybatisPlusPage));
    }

    /**
     * seata分布式事务测试
     *
     * @return {@link ResponseView<Boolean> }
     * @author Una Ma
     * @date 2020/01/30 12:24:29
     * @description seata
     * @status 已发布
     */
    @PostMapping(value = "/seata")
    public ResponseView<Boolean> seata(){
        return ResponseView.success(rpcContentService.insertContent());
    }

}
