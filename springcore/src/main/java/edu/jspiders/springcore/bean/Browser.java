package edu.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component //IOC inversion
@Scope("singleton")//and prototype
public class Browser {
	
	{
		System.out.println("Browser is created");
	}

	@Value("Google Chrome")
	private String name;
	
	@Value("132.0.6834.83")
	private String version;
	
	@Autowired //dependency injection , injecting the dependency
	private Internate internate;
	
}
