package com.example.IO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> fileDummy = new ArrayList<String>();
		
		File files = new File("C:\\Users\\kursad.aydin\\Desktop\\JavaIO");
		/*files.createNewFile();
		System.out.println(files.getParent());*/
		
		File [] fileList = files.listFiles();
		
		for (int i = 0; i < fileList.length; i++) {
			
			if (fileList[i].isDirectory()){
				
				fileDummy.add(fileList[i].getName());
			}
			
			System.out.print(fileDummy);
		}
		
	}

}
