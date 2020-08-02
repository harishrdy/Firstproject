package com.firstproject;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Viewfile {
	public static void main(String[] args) {
		
	
		File files = new File("C:\\\\Users\\\\hgangireddy\\\\Downloads\\\\locked\\\\directory");
		File filenames[] = files.listFiles(); {
		
		for (File filename : filenames)
		{
			
			System.out.println(filename);
			System.out.println("File Name : " + filename.getName());
		}

	}
	}
}