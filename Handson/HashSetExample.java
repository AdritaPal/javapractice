package Handson;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Akhila");
		set.add("Anurag");
		set.add("Bharath");
		set.add("Noor");
		set.add("Akhila");
		set.add("Adrita");
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}




	}

}
