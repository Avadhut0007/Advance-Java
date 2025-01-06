package edu.jspiders.practisefilehandling.operations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CharSteamScanner {

	public static void main(String[] args) throws IOException {
		
		File file = new File("F:\\Qspider\\Files\\Avadhut.txt");
		if (file.exists()) {
			Scanner scanner = new Scanner(file);
			System.out.println("File is present ");
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} else {
			System.out.println("File does not found");
		}
	}
}
