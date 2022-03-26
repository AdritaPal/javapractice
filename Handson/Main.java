package Handson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Credit c=new Credit();
		Scanner sc=new Scanner(System.in);
		int choice=0,limit=5000;
		while(choice!=5) {
			System.out.println("1. Engine $3000\n2. Suspension $1500\n3. Tyre $500\n4. Music System $3000\n5. Exit\n your credit balance is"+limit);
			choice=sc.nextInt();
			if (choice==5) {
				break;
			}
			else{
				limit=c.credituser(choice,limit);
			}
		}
	}
}
class Credit{
	public int credituser(int c,int l) {
		int p=0;
		if (c==1 ) {
			p=3000;
		}
		
		if (c==2) {
			p=1500;
		}
		
		if (c==3 ) {
			p=500;
		}
		
		if (c==4) {
			p=3000;
		}
		if(l>=p) {
			l=l-p;
		}
		else if(l<p) {
			System.out.println("Sorry "+l);
		}
		return l;
	}
	
}