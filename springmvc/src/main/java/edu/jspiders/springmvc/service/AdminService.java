package edu.jspiders.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.jspiders.springmvc.dao.AdminDAO;
import edu.jspiders.springmvc.dto.Admin;

@Controller
public class AdminService {

	@Autowired
	private AdminDAO adminDAO;
	
	public boolean addAdmin(String email, String password) {
		Admin admin = new Admin();
		admin.setEmail(email);
		admin.setPassword(password);
		
		try {
			adminDAO.addAdmin(admin);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
