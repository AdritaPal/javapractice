package IOjava8;

class Employee implements java.io.Serializable {
   private String name;
   private int experience;
   private int salary;
   
   Employee(String name,int experience,int salary){
	   this.name=name;
	   this.experience=experience;
	   this.salary=salary;
   }
}
