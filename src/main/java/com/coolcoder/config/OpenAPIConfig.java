package com.coolcoder.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;


@Configuration
public class OpenAPIConfig {
	
	  @Value("${coolcoder.openapi.dev-url}")
	  private String devUrl;
	  
	  @Bean
	  public OpenAPI myOpenAPI() {
	    Server devServer = new Server();
	    devServer.setUrl(devUrl);
	    devServer.setDescription("Server URL in Development environment");

	   

	    Contact contact = new Contact();
	    contact.setEmail("coolcoder@gmail.com");
	    contact.setName("Cool Coder");
	    contact.setUrl("https://www.coolcoder.com");


	    Info info = new Info()
	        .title("Tutorial Management API")
	        .version("1.0")
	        .contact(contact)
	        .description("This API exposes endpoints to manage tutorials.").termsOfService("https://www.coolcoder.com/terms");
	        

	    return new OpenAPI().info(info).servers(List.of(devServer));
	  }

}
