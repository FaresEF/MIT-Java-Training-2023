package com.mit.training.tables;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.File;

public final class PersonFile {
	public static void main(String args[]) {
		
     PersonInfo pers1 = new PersonInfo();
     PersonAddress pers2=new PersonAddress();
     
        pers1.setFirstName("Fares");
		pers1.setLastName("El Fakhoury");
		
		pers2.setAddressLine1("Lebanon-Bekaa");
		pers2.setAddressLine2("Zahle");
		pers2.setCity("Mekkseh");
		pers2.setState("Koulala");
		pers2.setZip("llll");
		pers2.setAddressType("Nice");

		
		File file = new File("C:\\Users\\EFares\\Documents\\CLASS\\test.txt");

		Writer writer;

		try {
			if (!file.exists()) {
				System.out.println(file.createNewFile());
			}

			writer = new FileWriter("C:\\Users\\EFares\\Documents\\CLASS\\test.txt", true);
			writer.write(pers1.getFirstName());
			writer.write(" " +pers1.getLastName());
			writer.write(pers2.getAddressLine1());
			writer.write(pers2.getAddressLine2());
			writer.write(pers2.getAddressType());
			writer.write(pers2.getCity());
			writer.write(pers2.getState());
			writer.close();
			
			Reader reader = new FileReader("C:\\Users\\EFares\\Documents\\CLASS\\test.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
