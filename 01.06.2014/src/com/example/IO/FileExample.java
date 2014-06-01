package com.example.IO;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.Box.Filler;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> fileDummy = new ArrayList<String>();
		
		File files = new File("C:\\Users\\kursad.aydin\\Desktop");
		/*files.createNewFile();
		System.out.println(files.getParent());*/
		
		File [] fileList = files.listFiles();
		
		for (int i = 0; i < fileList.length; i++) {
			
			if (fileList[i].isDirectory()){
				
				fileDummy.add(fileList[i].getName());
				
												
			}
			
							
			}
		String filename;
		
		while (true) {
			
			
			if(fileDummy.contains(filename=JOptionPane.showInputDialog(null,"Aranacak Dizin")))
				
			Desktop.getDesktop().open(new File(files +"\\" + filename));	
			break;
			
			
		}
		}
		
		
		
	}


