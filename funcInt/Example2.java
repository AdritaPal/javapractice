package funcInt;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("A","B","C");
		System.out.println("Lambda");
		l.stream().map(x->x.toLowerCase()).forEach(x->System.out.println(x));
		
		System.out.println("method reference");
        l.stream().map(String::toLowerCase).sorted().forEach(System.out::println);
	}

}
