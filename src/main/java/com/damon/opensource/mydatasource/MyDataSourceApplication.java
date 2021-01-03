package com.damon.opensource.mydatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class MyDataSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDataSourceApplication.class, args);
	}

}
