package IOjava8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	   public static void main(String [] args) {
		   Scanner sc = new Scanner (System.in);
		   String n = sc.nextLine();
		   int e=sc.nextInt();
		   int s=sc.nextInt();
	      Employee e1 = new Employee(n,e,s);
	      
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e1);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }
	}
