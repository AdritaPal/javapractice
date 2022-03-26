package exception;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		sc.close();
		n = (n*n+2*n*n*n+15)%40;
		Company c = new Company();
		try {
			c.check(n);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println(n);
		}
	}

}
class Company{
	public void check(int n) throws Exception {
		if(n<5) {
			throw new Exception("SMALL");
		}
		else if(n>20) {
			throw new Exception("LARGE");
			
		}
	}
}