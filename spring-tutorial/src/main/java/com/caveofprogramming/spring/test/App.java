package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/caveofprogramming/spring/test/beans/beans.xml");

		Person person1 = (Person) context.getBean("person");
		//person1.speak();
		Person person2 = (Person) context.getBean("person");
		
		Address address = (Address) context.getBean("address");
		person1.setTaxId(32222);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(address);
		((ClassPathXmlApplicationContext) context).close();
	}
}
