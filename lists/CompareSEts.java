package lists;

import java.util.*;

public class CompareSEts {

	public static void main(String[] args) {
		Set<String> s1=new HashSet<>();
		s1.add("Jess");
		s1.add("Russel");
		s1.add("Sarah");
		s1.add("Nick");
		s1.add("Caroline");
		s1.add("Shelby");
		s1.add("Sam");
		s1.add("Winston");
		s1.add("Aly");
		s1.add("Julia");
		System.out.println("Set 1: "+s1);
		
		Set<String> s2=new HashSet<>();
		s2.add("Abby");
		s2.add("Sam");
		s2.add("Schmidt");
		s2.add("Russel");
		s2.add("Paul");
		s2.add("Jess");
		s2.add("Caroline");
		s2.add("Nick");
		s2.add("Reagan");
		s2.add("Cece");
		System.out.println("Set 2: "+s2);

        s1.retainAll(s2);
        System.out.println(s1);

		}

}
