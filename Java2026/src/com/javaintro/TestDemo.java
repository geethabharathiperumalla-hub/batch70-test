package com.javaintro;

public class TestDemo {
	static int a = 0;
	TestDemo() {
		a++;
	}
	
	public static void main(String[] args) {
		new TestDemo();
		new TestDemo();
		new TestDemo();
		new TestDemo();
		System.out.println("objects count:"+a);
		
		
		}
		

	}


