package com.una.alibabaarticles;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AlibabaArticlesApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AlibabaArticlesApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}

}
