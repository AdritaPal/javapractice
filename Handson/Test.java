package Handson;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> al=new LinkedList<String>();  
		Scanner sc=new Scanner(System.in);
		int c=0;
		while(c!=4) {
			c=sc.nextInt();
			String s=sc.nextLine();
			al.add(s);
		}
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
