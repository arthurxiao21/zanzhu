package com.zanzhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zanzhu.mapper")
@ComponentScan
public class SsmAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmAppApplication.class, args);
	}
}
