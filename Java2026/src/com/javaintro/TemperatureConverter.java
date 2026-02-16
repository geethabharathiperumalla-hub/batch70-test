package com.javaintro;

public class TemperatureConverter {
	double cel=30;
	double f ;


	public static void main(String[] args) {
		TemperatureConverter t =new TemperatureConverter();
		
		t.f = ((t.cel*9/5)+32);
		t.cel=((t.f-32)*5/9);
		System.out.println("fahrenheit:"+t.f);
		System.out.println("celcius:"+t.cel);
		
		
		
		

	}

}
