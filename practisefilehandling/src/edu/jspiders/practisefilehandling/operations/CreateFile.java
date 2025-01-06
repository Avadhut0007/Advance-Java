package edu.jspiders.practisefilehandling.operations;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("F:\\Qspider\\Files\\Avadhut.txt");
		if(file.exists()) {
			System.out.println("File is alredy present");
		}else {
			file.createNewFile();
			System.out.println("File is created successfully");
		}

	}

}
