package com.khauminhduy.checkedandunchecked;

import java.io.IOException;

import com.khauminhduy.customexception.MyCustomException;

public class MyClass {

	public void greeting(String name) throws RuntimeException {
		System.out.println(name);
	}

	public void greeting2(String name) throws IOException {
		System.out.println(name);
	}
	
	public void greeting3(String name) throws MyCustomException {
		System.out.println(name);
		throw new MyCustomException("My Custom Exception");
	}

}
