package com.javaintro;

public class Price {
	

	public static void main(String[] args) {
		int amount=100;
		int pencilecost=7;
		int totalpencils = amount/pencilecost;
		int totalpencilecost = totalpencils*pencilecost;
		int remainingamount = amount-totalpencilecost;
		System.out.println("totalpencils:"+totalpencils);
		System.out.println("remainingamount:"+remainingamount);
		
		
		
		

	}

}
