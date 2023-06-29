package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext();
		// 将Bean.class作为配置类，注册到容器中
		context.register(Bean.class);
		context.refresh();
		// 从容器中获取Bean
		System.out.println(context.getBean(Bean.class));



		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Bean bean = applicationContext.getBean(Bean.class);
	}
}
