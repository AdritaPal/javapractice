package Handson;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Recruitment r=new Recruitment();
		int candidate=0;
		while(candidate<3) {
			int y=sc.nextInt();
			String d=sc.nextLine();
			candidate=r.shortlist(y, d, candidate);
		}
		System.out.println("Selection process completed");
	}

}
class Recruitment{
	public int shortlist (int y,String d,int c) {
		if(y>5 && d=="MBA") {
			c=c+1;
		}
		return c;
		
		
	}
}