package com.una.alibabaarticles.mybatis.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.una.alibabaarticles.mybatis.mapper.ContentMapper;
import com.una.alibabaarticles.mybatis.model.Content;
import com.una.alibabaarticles.mybatis.service.ContentService;
/**
 *${description}
 *@author Una Ma
 *@date 2020/1/28 11:30 下午
 *@menu ${description}
*/
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements ContentService{

}
