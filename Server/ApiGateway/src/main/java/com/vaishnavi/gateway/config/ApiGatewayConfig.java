package com.vaishnavi.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {
	
		@Bean
		public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
			return builder.routes()
					.route(p -> p.path("/get")
							.filters(f -> f.addRequestHeader("MyHeader", "MyURI").addRequestHeader("Param", "MyValue"))
							.uri("http://httpbin.org:80"))
					.route(p -> p.path("/fms/**")
							.uri("lb://fms"))
					.route(p -> p.path("/search/**")
							.uri("lb://search"))
					.build();
		}

}
