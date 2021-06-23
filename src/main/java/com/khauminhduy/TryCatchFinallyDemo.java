package com.khauminhduy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Paths.get("src/main/resources/data.txt"));
			lines.forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Finished");
		}
	}

}
