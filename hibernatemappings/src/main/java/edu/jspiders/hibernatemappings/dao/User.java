package edu.jspiders.hibernatemappings.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = false)
	private String name;
	@Column(nullable = false, unique = true)
	private long mobile;
	@OneToOne
	private AadharCard aadharCard;

}
