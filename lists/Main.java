package lists;

import java.util.*;

class Student implements Comparable<Student> {
	int roll_no;
	String name;
	int age;
	Student(int roll_no, String name, int age) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student s) {
		if(age==s.age) {
			return 0;
		}
		else if(age>s.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"Ankush",21));
		list.add(new Student(2,"Sen",24));
		list.add(new Student(3,"Papri",23));
		list.add(new Student(4,"Bidya",20));
		list.add(new Student(5,"Adrita",22));
		
		Iterator itr = list.iterator();
		
		System.out.println("Before Sorting: ");
		while (itr.hasNext()) {
			Student s= (Student) itr.next();
			System.out.println(s.roll_no+" "+s.name+" "+s.age);
		}
		
		System.out.println("\nSorting by Age: (Using Comparable) ");
		Collections.sort(list);
		Iterator itr1 = list.iterator();
		
		while (itr1.hasNext()) {
			Student s= (Student) itr1.next();
			System.out.println(s.roll_no+" "+s.name+" "+s.age);
		}
		

		
	}

}