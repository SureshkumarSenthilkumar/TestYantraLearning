package com.tyss.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SasiDharan {

	String task(File file) throws IOException {
		String s = "";
		FileReader b = new FileReader(file);
		int read = b.read();
		while (read > 0) {
			s += ((char) read);
			read = b.read();
		}
		return s;
	}
}
