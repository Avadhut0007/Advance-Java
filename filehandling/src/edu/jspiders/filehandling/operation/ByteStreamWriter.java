package edu.jspiders.filehandling.operation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWriter {

	public static void main(String[] args) throws IOException {
		byte[] password = {'A','B','C','D','E'};
		File file = new File("F:\\Qspider\\Files\\demo.txt");
		if(file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(password);
			fileOutputStream.close();
			System.out.println("Data is written in file");
			
		}else {
			file.createNewFile();
			System.out.println("File is created");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(password);
			fileOutputStream.close();
			System.out.println("Data is written in file");
		}

	}

}
