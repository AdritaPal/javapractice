package funcInt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;

public class Example implements BiFunction<	List<String>, Set<String>, Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj=new Example();
		Set set=new HashSet();
		set.add("Java");
		set.add("JDK");
		System.out.println(obj.apply(Arrays.asList("Java","JRE","JDK","Python","C","C++"), set));
	}

	@Override
	public Integer apply(List<String> l, Set<String> s) {
		// TODO Auto-generated method stub
		int totalLength=0;
		for(String str: l) {
			totalLength=totalLength+1;
		}
		for(String str2: s) {
			totalLength=totalLength+1;
		}
		
		return totalLength;
	}

}
