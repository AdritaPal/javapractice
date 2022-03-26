package IOjava8;

public class Test{
	public static void main(String [] args) {
		int a1 = 10;
		int b1= 30;
		float a2=40.0f;
		float b2=50.0f;
		Arithmetic a=new Arithmetic();
		System.out.println("1: "+a.add(a1, b1));
		a.add();
		System.out.println("3: "+a.add(a2, b2));
	}
	
	
}
