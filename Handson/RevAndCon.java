package Handson;

import java.util.Scanner;

public class RevAndCon {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String str1= sc.nextLine();
		String str2= sc.nextLine();
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer sb2=new StringBuffer(str2);
		sb1.reverse();
		sb2.reverse();
		
		str1=sb1.toString();
		str2=sb2.toString();

		System.out.println(str1+str2);
		
	}
}
