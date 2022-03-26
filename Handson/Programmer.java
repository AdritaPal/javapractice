package Handson;

public class Programmer extends Employee {
	int bonus = 15000;
	float total_salary=0.0f;
	public float calculate(int a, float b) {
		return (a+b);
	}

	public static void main(String[] args) {
		Programmer obj=new Programmer();
		float total=obj.calculate(obj.bonus, obj.salary);
		
		System.out.println("Total Salary: "+total);
	}

}
