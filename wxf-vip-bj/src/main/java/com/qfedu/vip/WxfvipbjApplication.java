package com.qfedu.vip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WxfvipbjApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxfvipbjApplication.class, args);
	}

}
