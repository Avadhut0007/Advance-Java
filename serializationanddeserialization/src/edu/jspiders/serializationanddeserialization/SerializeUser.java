package edu.jspiders.serializationanddeserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUser {

	public static void main(String[] args) throws IOException {
		
		User user = new User("Ramesh","ramesh@gmail.com",7770004383l,"Pune");
		
		File file = new File("F:\\Qspider\\Files\\user.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream) ;
		objectOutputStream.writeObject(user);
		objectOutputStream.close();
		fileOutputStream.close();
		System.out.println("User is serialized");

	}

}
