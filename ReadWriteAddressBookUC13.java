package com.filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteAddressBookUC13 {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\Users\\SHRADHA\\Desktop\\test.txt");
		Scanner scanner = new Scanner(file);
		
		//to print all line we use while loop
		while(scanner.hasNextLine()) {
		System.out.println(scanner.nextLine());	
		}
		//to write file
		String fileContent = "";
		while(scanner.hasNextLine()) {
			fileContent = fileContent.concat(scanner.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("C:\\Users\\SHRADHA\\Desktop\\newfile.txt");
		writer.write(fileContent);
		writer.close();
	}
}
