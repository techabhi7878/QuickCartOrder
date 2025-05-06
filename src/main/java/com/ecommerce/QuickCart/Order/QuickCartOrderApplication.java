package com.ecommerce.QuickCart.Order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class QuickCartOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickCartOrderApplication.class, args);
	}

}
