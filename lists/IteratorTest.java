package lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList <>();
		names.add("Adrita");
		names.add("Erin");
		names.add("Toby");
		names.add("Kelly");
		names.add("Holly");
		names.add("Kevin");
		names.add("Oscar");
		names.add("Robert");
		names.add("Jan");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
