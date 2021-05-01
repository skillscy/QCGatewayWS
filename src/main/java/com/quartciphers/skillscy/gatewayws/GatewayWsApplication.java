package com.quartciphers.skillscy.gatewayws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.io.ObjectInputFilter;

@SpringBootApplication
@EnableEurekaClient
public class GatewayWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayWsApplication.class, args);
	}

}
