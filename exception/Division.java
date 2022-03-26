package exception;

import java.util.Scanner;

public class Division  {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2= sc.nextInt();
		String name = "Adrita";
		
		try {
			System.out.println(n1/n2);
		}catch (ArithmeticException e) {
			System.out.println("Division by zero not allowed!");
		}
		
		name = null;
		if(name == null) {
			try {
				throw new NullPointerException();
			}
			catch(NullPointerException e) {
				System.out.println("!");

			}
		}
		
		
		
	}

}
