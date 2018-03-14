package com.formation.facade;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.service.IMembreService;

public class Facade {
	
	private static Facade uniqueInstance;
	
	public static synchronized  Facade getInstance(){
		
		if (uniqueInstance == null) {
			uniqueInstance = new Facade();
		}
		
		return uniqueInstance;
	}
	
	private ApplicationContext springContext;
	
	private IMembreService membreService;
	

	private Facade(){
		springContext = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		
		membreService = springContext.getBean(IMembreService.class);
	}
	
	public IMembreService getMembreService() {
		return membreService;
	}
}
