package com.una.alibabausers;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AlibabaUsersApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AlibabaUsersApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}

}
