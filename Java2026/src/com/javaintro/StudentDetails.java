package com.javaintro;

public class StudentDetails {
	int studentID;
	String studentName;
	static int collegeID;
	static String collegeName;

	public static void main(String[] args) {
		System.out.println("MAIN METHOD STERTED");
		System.out.println("V CUBE RELATED INFORMATION");
		collegeID=777;
		collegeName="vcube";
		StudentDetails t = new StudentDetails();
		t.studentID=17;
		t.studentName="BHARATHI";
		System.out.println("**********STUDENT1 INFORMATION**********");
		System.out.println("College ID:"+collegeID);
		System.out.println("College Name:"+collegeName);
		System.out.println("Student ID:"+t.studentID);
		System.out.println("Student Name:"+t.studentName);
		
		collegeID=555;
		collegeName="vnc";
		StudentDetails s = new StudentDetails();
		s.studentID=18;
		s.studentName="SNEHALATHA";
		System.out.println("**********STUDENT2 INFORMATION**********");
		System.out.println("College ID:"+collegeID);
		System.out.println("College Name:"+collegeName);
		System.out.println("Student ID:"+s.studentID);
		System.out.println("Student Name:"+s.studentName);
		StudentDetails r = new StudentDetails();
		r.studentID=19;
		r.studentName="RAMYA";
		System.out.println("**********STUDENT3 INFORMATION**********");
		System.out.println("College ID:"+collegeID);
		System.out.println("College Name:"+collegeName);
		System.out.println("Student ID:"+r.studentID);
		System.out.println("Student Name:"+r.studentName);
		StudentDetails a = new StudentDetails();
		a.studentID=20;
		a.studentName="ANUSHA";
		System.out.println("**********STUDENT4 INFORMATION**********");
		System.out.println("College ID:"+collegeID);
		System.out.println("College Name:"+collegeName);
		System.out.println("Student ID:"+a.studentID);
		System.out.println("Student Name:"+a.studentName);
		StudentDetails h = new StudentDetails();
		h.studentID=21;
		h.studentName="HIMANJALI";
		System.out.println("**********STUDENT5 INFORMATION**********");
		System.out.println("College ID:"+collegeID);
		System.out.println("College Name:"+collegeName);
		System.out.println("Student ID:"+h.studentID);
		System.out.println("Student Name:"+h.studentName);
		
		
		

		
		
	}

}
