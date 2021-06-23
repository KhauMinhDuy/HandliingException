package com.khauminhduy;

public class WorkWithTryCatch {

	public static void main(String[] args) {
		int x = 12;
		int y = 5;
		try {
			int result = x / (y - 2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("finished");
	}
}
