package multithreading;

import java.util.Scanner;

class Account extends Thread{
	
	private String accNo;
	private double balance;
	private String accountHolder;
	double roi;
	Account(){
		
	}
	public Account(String accNo, double balance, String accountHolder) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void run() {
		if(balance>=10000) {
			roi = 0.8*balance;
			System.out.println(String.format("%.2f",roi));

		}
		else {
			roi = 0.5*balance;
			System.out.println(String.format("%.2f",roi));

		}
		System.out.println(String.format("%.2f",balance+roi));
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n+1;i++) {
			String an = sc.nextLine();
			double b = sc.nextDouble();
			String hold = sc.nextLine();
			Account a1 = new Account(an,b,hold);
			a1.start();
		}
	}

}
