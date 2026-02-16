package com.javaintro;

public class StudentInfo {
	String student_Name;
	int student_ID;
	int student_Age;
	char student_Gender;
	int total_Marks;
	int avg;
	int a;
	int b;
	int c;
	int d;
	int e;
	
	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo();
		s1.student_Name="GEETHA";
		s1.student_ID=18;
		s1.student_Age=15;
		s1.student_Gender='F';
		s1.a=98;
		s1.b=89;
		s1.c=78;
		s1.d=87;
		s1.e=79;
		int total_Marks =s1.a+s1.b+s1.c+s1.d+s1.e;
		double average=s1.a+s1.b+s1.c+s1.d+s1.e;
			
		System.out.println("*********STUDENT1 INFO*********");
		System.out.println("student_Name:"+ s1.student_Name);
		System.out.println("student_ID:"+ s1.student_ID);
		System.out.println("student_Age:"+ s1.student_Age);
		System.out.println("student_Gender:"+ s1.student_Gender);
		System.out.println("total_Marks:"+total_Marks);
		System.out.println("student_average:"+average/5);
		StudentInfo s2 = new StudentInfo();
		s2.student_Name="GEETHA";
		s2.student_ID=18;
		s2.student_Age=15;
		s2.student_Gender='F';
		s2.a=95;
		s2.b=85;
		s2.c=73;
		s2.d=77;
		s2.e=74;
		int totalMarks =s2.a+s2.b+s2.c+s2.d+s2.e;
		double avg=s2.a+s2.b+s2.c+s2.d+s2.e;
			
		System.out.println("*********STUDENT2 INFO*********");
		System.out.println("student_Name:"+ s2.student_Name);
		System.out.println("student_ID:"+ s2.student_ID);
		System.out.println("student_Age:"+ s2.student_Age);
		System.out.println("student_Gender:"+ s2.student_Gender);
		System.out.println("total_Marks:"+totalMarks);
		System.out.println("student_average:"+avg/5);
		}

}
