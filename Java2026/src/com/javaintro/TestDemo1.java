package com.javaintro;

public class TestDemo1 {
	static TestDemo1 h=new TestDemo1();
	void hello() {
		System.out.println("hello method called");
	}
	void hello1() {
		System.out.println("hello1 called");
	}
	static void hello2() {
		System.out.println("hello2 called");
	}
	static void hello3() {
		System.out.println("hello3 called");
	}
	public static void main(String[] args) {
		h.hello();
		h.hello1();
		h.hello2();
		h.hello();
	}
}
