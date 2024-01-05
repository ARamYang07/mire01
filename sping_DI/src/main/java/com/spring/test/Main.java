package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		//C c = new C();
		
		ApplicationContext context
			= new GenericXmlApplicationContext(
					"classpath:com/spring/context/application.xml");
			
		C c = context.getBean("c",C.class);
		
		Z z = c.getZ();
		
		z.a();
		
		
		
	}

}
