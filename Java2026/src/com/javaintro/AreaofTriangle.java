package com.javaintro;

public class AreaofTriangle {
	
	int base;
	int height;
	double AOT;

	public static void main(String[] args) {
		AreaofTriangle a = new AreaofTriangle();
		a.base=30;
		a.height=15;
		a.AOT=0.5*(a.base*a.height);
		System.out.println("Area of triangle:"+a.AOT);
		
		
		

	}

}
