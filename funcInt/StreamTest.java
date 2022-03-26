package funcInt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,9,2,22,4,1,7,99,6,15,25);
		//System.out.println("LE");
		//l.stream().forEach(x->System.out.println(x));
		
		//System.out.println("\nMR");
		//l.stream().forEach(System.out::println);
		
		//boolean a=l.stream().allMatch(x->x<100);
		//System.out.println(a);
		
		//System.out.println(l.stream().anyMatch(x->x%2==0));
		
		//System.out.println(l.stream().count());
		
		
		//System.out.println(l.stream().isParallel());
		
		//System.out.println(l.stream().noneMatch(x->x%10==0));
		
		//l.stream().filter(x->x%3==0).forEach(x->System.out.println(x));
		
		//l.stream().distinct().forEach(x->System.out.println(x));
		//List<Integer> l2=l.stream().filter(x->x%4==0).collect(Collectors.toList());
		//l2.stream().forEach(System.out::println);
		//Stream<String> s=Stream.empty();
		//s.forEach(System.out::println);
		//l.stream().limit(4).forEach(x->System.out.println(x));
		l.stream().map(x->x*100).forEach(x->System.out.println(x));
		Optional<Integer> a=l.stream().max((i,j)->i.compareTo(j));
		System.out.println(a);
		//l.stream().map(x->x+5).forEach(x->System.out.println(x));
		List <Integer> li = l.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(li);
		
		Integer sum=li.stream().reduce(0, (s,b)->s+b);
		System.out.println(sum);
		
		System.out.println(li.stream().equals(x%2==0));

	}

}
