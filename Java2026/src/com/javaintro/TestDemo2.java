package com.javaintro;

public class TestDemo2 {
	public static void show() {
		System.out.println("show method called");
		TestDemo2 s =new TestDemo2();
		s.hello();
	}
	public static void main(String[] args) {
		System.out.println("main mathod started");
		show();
	}
	
	public void hello() {
		System.out.println("hello method called");
	

	}
	
}



