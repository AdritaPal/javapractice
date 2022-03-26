package exception;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args)  {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		try {
			s.attend(sc.nextLine());
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}

class Student{
	public void attend (String name) throws Exception {
		if (name.length() < 8) {
			throw new Exception ("SHORT");
		}
		else if (name.length() > 18) {
			throw new Exception ("LONG");
		}
		System.out.println(name);
		
	}
}