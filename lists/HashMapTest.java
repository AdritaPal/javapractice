package lists;

import java.util.*;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Java");
		m.put(2, "C");
		m.put(3, "C++");
		m.put(4, "R");
		m.put(5, "Python");
		m.put(6, "PHP");
		System.out.println(m); 
		List<Entry<Integer, String>> list = new LinkedList<Entry<Integer,String>>(m.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer,String>>(){

			
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		Map<Integer, String> sm = new LinkedHashMap<>();

		for(Entry<Integer,String> entry: list) {
			sm.put(entry.getKey(), entry.getValue());
		}
		System.out.println(sm); 
	}

}
