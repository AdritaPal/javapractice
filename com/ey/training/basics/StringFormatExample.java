package com.ey.training.basics;

public class StringFormatExample {

	public static void main(String[] args) {
		double d = 1205.6358;

	      System.out.println(d);

	      System.out.println(String.format("%.2f", d));

	      System.out.format("%.3f", d);
		
		
//	      double x = Math.round(d * 100.0) / 100.0;
////	      Math.round(1205.6358*100.0)/100.0
////	      Math.round(120563.58)/100.0
////	      120564/100
////	      1205.64
//	      System.out.println(x);
	}

}
