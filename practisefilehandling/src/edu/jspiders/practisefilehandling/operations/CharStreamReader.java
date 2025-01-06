package edu.jspiders.practisefilehandling.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamReader {
	public static void main(String[] args) throws IOException {
		
		File file = new File("F:\\Qspider\\Files\\Avadhut.txt");
		String data ="";
		if(file.exists()) {
			int ascii=-1;
			System.out.println("Yes");
			FileReader fileReader = new FileReader(file);
			while((ascii=fileReader.read()) != -1) {
				data = data + (char)ascii;
			}
			System.out.println(data);
			fileReader.close();
			
		}else{
			System.out.println("No");
		}
	}

}
