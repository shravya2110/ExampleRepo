package com.cg.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		ApplicationContext ob=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee e=ob.getBean(Employee.class);
		e.setId(101);
		e.setName("san");
		System.out.println(e);
	}

}
