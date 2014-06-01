package com.example.IO;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		File files = new File("C:\\Users\\kursad.aydin\\Desktop\\JavaIO\\text.xls");
		files.createNewFile();
		System.out.println(files.getParent());
		System.out.println(files.canRead());
		
	}

}
