/**
 * 
 */
package com.mit.training.tables;
import java.io.*;
import java.util.Properties;

import java.io.*;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        // Define file path for ease of use
        String filePath = "C:\\Users\\EFares\\Documents\\CLASS\\test.properties";

        try (OutputStream outputStream = new FileOutputStream(filePath);
             InputStream inputStream = new FileInputStream(filePath)) {

            File fileOut = new File(filePath);
            if (!fileOut.exists()) {
                if (!fileOut.createNewFile()) {
                    fileOut.getParentFile().mkdirs();   // Create parent folders if they don't exist
                }
            }

            Properties prop = new Properties();
            prop.setProperty("Fares", "Layla, Lamita");
            prop.setProperty("Messi", "Ronaldo, Haaland");
            prop.store(new FileWriter(fileOut), "Properties");

            prop.load(inputStream);

            System.out.println(prop.getProperty("Fares"));
            System.out.println(prop.getProperty("Messi"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}