package edu.jspiders.filehandling.operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamReader {
	public static void main(String[] args) throws IOException {
		
		File file = new File("F:\\Qspider\\Files\\demo.txt");
		String data ="";
		if(file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			int lastIndex= -1;
			while((lastIndex =fileInputStream.read()) != -1)
			{
				data += (char)lastIndex;
			}
			System.out.println(data);
			fileInputStream.close();
		}
		else {
			System.out.println("File not found!");
		}
	}

}
