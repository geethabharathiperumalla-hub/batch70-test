package com.javaintro;

public class Cricket {
	String playername;
	int jersyno;
	int age;
	int highestscore;
	static String board = "BCCI";

	public static void main(String[] args) {
		Cricket g= new Cricket();
		g.playername = "virat";
		g.jersyno = 17;
		g.age = 25;
		g.highestscore = 250;
	    System.out.println("*******player1*******");
		System.out.println("NAME:"+g.playername);
		System.out.println("jersyno:"+g.jersyno);
		System.out.println("Age:"+g.age);
		System.out.println("Score:"+g.highestscore);
		System.out.println("Board:"+g.board);
		Cricket v= new Cricket();
		v.playername = "dhoni";
		v.jersyno = 18;
		v.age = 29;
		v.highestscore = 256;
	    System.out.println("*******player2*******");
		System.out.println("NAME:"+v.playername);
		System.out.println("jersyno:"+v.jersyno);
		System.out.println("Age:"+v.age);
		System.out.println("Score:"+v.highestscore);
		System.out.println("Board:"+v.board);
		Cricket y= new Cricket();
		y.playername = "mahess";
		y.jersyno = 19;
		y.age = 30;
		y.highestscore = 299;
	    System.out.println("*******player3*******");
		System.out.println("NAME:"+y.playername);
		System.out.println("jersyno:"+y.jersyno);
		System.out.println("Age:"+y.age);
		System.out.println("Score:"+y.highestscore);
		System.out.println("Board:"+y.board);
		Cricket a= new Cricket();
		a.playername = "prabas";
		a.jersyno = 20;
		a.age = 35;
		a.highestscore = 230;
	    System.out.println("*******player4*******");
		System.out.println("NAME:"+a.playername);
		System.out.println("jersyno:"+a.jersyno);
		System.out.println("Age:"+a.age);
		System.out.println("Score:"+a.highestscore);
		System.out.println("Board:"+a.board);




	}

}
