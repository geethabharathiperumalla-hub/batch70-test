package com.javaintro;

public class Cricketer {
	static int countryID=99;
	static String countryName="INDIA";
	int jerseyNo;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to indian cricketer");
		Cricketer t = new Cricketer();
		t.jerseyNo=10;
		t.cricketerName="virat";
		System.out.println("****player1******");
		System.out.println("countryID:"+t.countryID);
		System.out.println("countryName:"+t.countryName);
		System.out.println("Jerseyno:"+t.jerseyNo);
		System.out.println("criketername:"+t.cricketerName);
		Cricketer m = new Cricketer();
		m.jerseyNo=11;
		m.cricketerName="dhoni";
		System.out.println("****player2******");
		System.out.println("countryID:"+m.countryID);
		System.out.println("countryName:"+m.countryName);
		System.out.println("Jerseyno:"+m.jerseyNo);
		System.out.println("criketername:"+m.cricketerName);
		System.out.println("main method ended");
	}

}

