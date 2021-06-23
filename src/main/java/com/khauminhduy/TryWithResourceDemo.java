package com.khauminhduy;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/data.txt"));) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
