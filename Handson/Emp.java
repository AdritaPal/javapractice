package Handson;

class Emp extends Person {
	float salary;

	public Emp(int id, String name,float salary) {
		super(id, name);
		this.salary=salary;
	}

	public static void main(String[] args) {
		Emp e=new Emp(001, "Kelly Kapoor", 32000.0f);
		System.out.println(e.id+"\n"+e.name+"\n"+e.salary);
		
	}

}
