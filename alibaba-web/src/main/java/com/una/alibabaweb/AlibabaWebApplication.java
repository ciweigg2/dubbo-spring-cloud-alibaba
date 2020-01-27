package com.una.alibabaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class}) //web不需要连接数据库 所以排除自动装配类
public class AlibabaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlibabaWebApplication.class, args);
	}

}
