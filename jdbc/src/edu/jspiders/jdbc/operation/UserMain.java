package edu.jspiders.jdbc.operation;

public class UserMain {

	public static void main(String[] args) {
		UserOperation operation = new UserOperation();
		
		try {
			operation.signUp();
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

	}

}
