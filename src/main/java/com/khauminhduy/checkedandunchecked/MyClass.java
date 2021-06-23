package com.khauminhduy.checkedandunchecked;

import java.io.IOException;

public class MyClass {

	private String name;

	public void greeting(String name) throws RuntimeException {
		System.out.println(name);
	}

	public void greeting2(String name) throws IOException {
		System.out.println(name);
	}

}
