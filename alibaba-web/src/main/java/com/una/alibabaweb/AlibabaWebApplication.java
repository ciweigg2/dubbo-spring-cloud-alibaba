package com.una.alibabaweb;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//web不需要连接数据库 所以排除自动装配类
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class ,DruidDataSourceAutoConfigure.class})
public class AlibabaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlibabaWebApplication.class, args);
	}

}
