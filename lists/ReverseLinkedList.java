package lists;

import java.util.*;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();  
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

	}

}
