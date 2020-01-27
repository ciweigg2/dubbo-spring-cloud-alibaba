package com.una.alibabaarticles.mybatis.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.una.alibabaarticles.mybatis.mapper.ArticlesMapper;
import com.una.alibabaarticles.mybatis.model.Articles;
import com.una.alibabaarticles.mybatis.service.ArticlesService;
/**
 *@className ArticlesServiceImpl
 *@description
 *@author Una Ma
 *@date 2020/1/27 7:02 下午
*/
@Service
public class ArticlesServiceImpl extends ServiceImpl<ArticlesMapper, Articles> implements ArticlesService{

}
