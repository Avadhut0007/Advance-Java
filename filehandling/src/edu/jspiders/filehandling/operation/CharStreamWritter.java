package edu.jspiders.filehandling.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWritter {
	
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Qspider\\Files\\demo.txt");
		if(file.exists()) {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Hello World");
			fileWriter.close();
			System.out.println("Data is witten to a file");
		}else {
			file.createNewFile();
			System.out.println("File is created");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Hello World");
			fileWriter.close();
			System.out.println("Data is witten to a file");
		}
	}

}
