package com.tyss.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		System.out.println("Program started");
		File a = new File("document");
		try {
			FileReader b = new FileReader(a);
			int read = b.read();
			while (read > 0 ) {
				System.out.print((char) read);
				read = b.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occured");
			e.printStackTrace();
		} catch (IOException f) {
			// TODO Auto-generated catch block
			System.out.println("IOException occured");
			f.printStackTrace();
		}
		System.out.println("\nProgram End");
		
	}
}
