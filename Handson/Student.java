package Handson;

import java.util.Scanner;

class Student {
	private String name;
	public Student(String name) {
		this.name=name;
	}
	public void attendance(){
		System.out.print(name+ " is present,Sir.");
	}

	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		Student s=new Student(sc.nextLine());
		s.attendance();
}
}		

