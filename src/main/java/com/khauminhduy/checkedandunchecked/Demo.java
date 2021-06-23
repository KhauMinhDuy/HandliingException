package com.khauminhduy.checkedandunchecked;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		myClass.greeting("Khau Minh Duy");
		
		try {
			myClass.greeting2("Khau MInh Duy");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
