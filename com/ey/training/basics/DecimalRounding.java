package com.ey.training.basics;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalRounding {
	
	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("#.##");

		double d=123.707;
		System.out.println(d);

		System.out.println(df.format(d)); //default
		
		df.setRoundingMode(RoundingMode.DOWN);
		System.out.println(df.format(d));
		
		df.setRoundingMode(RoundingMode.UP);
		System.out.println(df.format(d));

		df.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println(df.format(d));
	}

}
