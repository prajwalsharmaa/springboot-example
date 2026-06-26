package com.prajwal.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(ExampleApplication.class, args);

		//MyFirstClass myFirstClass = ctx.getBean("myBean" ,MyFirstClass.class);
		//MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
		//String hello = myFirstClass.sayHello();
		//System.out.println(hello);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
//		System.out.println(myFirstService.getJavaVersion());
//		System.out.println(myFirstService.getOsName());
//		System.out.println(myFirstService.readProp());
	}


}
