package edu.jspiders.practisefilehandling.operations;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		File file = new File("F:\\Qspider\\Files\\Avadhut.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("File is deletd succesfully");
		}
		else {
			System.out.println("File not found");
		}
	}
}
