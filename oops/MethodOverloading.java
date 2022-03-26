package oops;

public class MethodOverloading {

	void sum() {
		
		System.out.println("no para");
	}
	
	void sum(int a, int b) {
		
		System.out.println(a+b);
		
	}
void sum(int a, int b, int c) {
		
		System.out.println(a+b+c);
		
	}
public static void main(String [] args) {
	MethodOverloading mo = new MethodOverloading();
	mo.sum();
	mo.sum(10, 20);
	mo.sum(12, 22, 20);
		
	}
}
	

