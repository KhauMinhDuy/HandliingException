package com.khauminhduy.checkedandunchecked;

import java.io.IOException;

import com.khauminhduy.customexception.MyCustomException;

public class Demo {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		myClass.greeting("Khau Minh Duy");
		
		try {
			myClass.greeting2("Khau MInh Duy");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			myClass.greeting3("Khau Minh Duy");
		} catch (MyCustomException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
