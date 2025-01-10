package edu.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jspiders.hibernate.dto.UserDTO;

public class UserDAO {
	public static void main(String[] args) {
		UserDTO userDTO = new UserDTO();
		
	
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
	}
}
