package com.javaintro;

public class Salary {
	String Name="GEETHA";
	Integer salary=5000;
	Double pf=salary*0.08;
	Double da=salary*0.03;
	Double gst=salary*0.06;
	Double total=salary-pf-da-gst;
	{
		System.out.println("NAME:"+Name);
		System.out.println("SALARY:"+salary);
		System.out.println("PF:"+ pf);
		System.out.println("DA:"+ da);
		System.out.println("GST:"+ gst);
		System.out.println("TOTAL:"+ total);
		
	}


	public static void main(String[] args) {
		Salary t= new Salary();

	}

}
