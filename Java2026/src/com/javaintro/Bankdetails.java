package com.javaintro;

public class Bankdetails {
	static int sequence=123450;
	String userName;
	int phoneNumber;
	int balance;
	int accountNumber;
	{
		sequence=sequence+1;
	}

	public static void main(String[] args) {
		Bankdetails t = new Bankdetails();
		 t.userName = "geetha";
		 t.phoneNumber=86887912;
		 t.balance=4000;
		 t.accountNumber=98789665;
		System.out.println("********Object1 information********"); 
		System.out.println("sequence:"+t.sequence);
		System.out.println("username:" +t.userName);
		System.out.println("phonenumber:"+t.phoneNumber);
		System.out.println("balance:"+t.balance);
		System.out.println("accountnumber:"+t.accountNumber);
		Bankdetails p = new Bankdetails();
		 p.userName = "lakshmi";
		 p.phoneNumber=778063484;
		 p.balance=10000;
		 p.accountNumber=98789647;
		System.out.println("********Object2 information********"); 

		System.out.println("sequence:"+p.sequence);
		System.out.println("username:" +p.userName);
		System.out.println("phonenumber:"+p.phoneNumber);
		System.out.println("balance:"+p.balance);
		System.out.println("accountnumber:"+p.accountNumber);
		Bankdetails h = new Bankdetails();
		 h.userName = "hemalatha";
		 h.phoneNumber=94942383;
		 h.balance=5000;
		 h.accountNumber=9878944;
		System.out.println("********Object3 information********"); 
        System.out.println("sequence:"+h.sequence);
		System.out.println("username:" +h.userName);
		System.out.println("phonenumber:"+h.phoneNumber);
		System.out.println("balance:"+h.balance);
		System.out.println("accountnumber:"+h.accountNumber);
		Bankdetails l = new Bankdetails();
		 l.userName = "padma";
		 l.phoneNumber=86887912;
		 l.balance=4000;
		 l.accountNumber=98789665;
		System.out.println("********Object4 information********"); 
 
		System.out.println("sequence:"+l.sequence);
		System.out.println("username:" +l.userName);
		System.out.println("phonenumber:"+l.phoneNumber);
		System.out.println("balance:"+l.balance);
		System.out.println("accountnumber:"+l.accountNumber);
		Bankdetails c = new Bankdetails();
		 c.userName = "guptha";
		 c.phoneNumber=996631220;
		 c.balance=40000;
		 c.accountNumber=98789642;
		System.out.println("********Object5 infpormation********"); 

		 
		System.out.println("sequence:"+c.sequence);
		System.out.println("username:" +c.userName);
		System.out.println("phonenumber:"+c.phoneNumber);
		System.out.println("balance:"+c.balance);
		System.out.println("accountnumber:"+c.accountNumber);
		

	}

}
