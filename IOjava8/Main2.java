package IOjava8;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private  int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Main2 {
	 public static void main(String[] args) {
	        
			List list = new ArrayList();

		    list.add(new Person("Vidya",27));
		    list.add(new Person("Kavita",26));
		    list.add(new Person("Rohit",28));
			list.add(new Person("Pooja",25));
			list.add(new Person("Tanuja",29));
			list.add(new Person("Veena",22));
			list.add(new Person("Ramesh",30));
				
			list.forEach(e -> {
			      System.out.println("Person name: " + ((Person) e).getName()+"\nPerson age: "+((Person) e).getAge());
			    });
		   }
}
