package edu.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data

public class Internate {
	
	{
		System.out.println("Internate is created");
	}
	@Value("100Mbps")
	private String speed;

}
