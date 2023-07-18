package com.travels.abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtility {
	
	static void readLogoFromFileSystem() {
		File f = new File("C:/Users/dell/Desktop/Path/ABC_Travels.txt");

		try {

			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = null;
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error in Logo loading , please check and re launch !!");
			System.exit(0);
		}
	}

}
