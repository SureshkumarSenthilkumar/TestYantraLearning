package com.tyss.exception;

import java.io.File;
import java.io.IOException;

public class Vignesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SasiDharan sasi = new SasiDharan();
		File file = new File("document");
		String task;
		try {
			task = sasi.task(file);
			System.out.println(task);
		} catch (IOException e) {	
			e.printStackTrace();
		} 
	}
}
