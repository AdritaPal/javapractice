package com.ey.training.basics;

import java.util.Scanner;

public class BasicDeclarationUnderstanding {
	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		a=sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		
		int c = a+b;
		System.out.println("Sum: " +c);
		
	}

}
