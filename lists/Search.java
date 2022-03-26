package lists;

import java.util.*;

public class Search {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		Scanner sc=new Scanner(System.in);
		if(l.contains(sc.nextInt())) {
			System.out.println("Element Present");
		}
		else {
			System.out.println("Element not Found");

		}
		
	}

}
