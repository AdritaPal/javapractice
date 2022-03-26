package com.ey.training.basics;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {

	public static void main(String[] args) {
				double d=123.707;
				System.out.println(d);

//				BigDecimal bd=new BigDecimal(d);
//				System.out.println(bd);
//			    BigDecimal bd2 = bd.setScale(2, RoundingMode.UP);
//				System.out.println(bd2);
				
				BigDecimal bd3 = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
				System.out.println(bd3);
			}

		

	}


