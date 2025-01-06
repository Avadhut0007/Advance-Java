package edu.jspiders.practisefilehandling.operations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWritter {

	public static void main(String[] args) throws IOException {
		
		File file = new File("F:\\Qspider\\Files\\Avadhut.txt");
		if(file.exists()) {
			file.createNewFile();
			System.out.println("File does not found or file alredy exist");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Avadhut");
			fileWriter.write("Patil");
			fileWriter.close();
		}
		else {
			file.createNewFile();
			System.out.println("File is created succesfully");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Avadhut");
			fileWriter.close();
		}

	}

}
