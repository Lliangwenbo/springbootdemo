package com.feeling.apollo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@ComponentScan(basePackages = {"com.feeling.*"})//将该包下的文件纳入容器中
@EnableTransactionManagement
@ImportResource(locations={"config/*.xml"})
@MapperScan(basePackages="com.feeling.mapper")
@EnableAutoConfiguration
public class ApolloDemo {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApolloDemo.class, args);
	}
	
	
}
