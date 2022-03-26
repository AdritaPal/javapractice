package oops;

public class OopsClass {

	int a;
	int b;
	
//	public OopsClass(int v1,int v2) {
//		System.out.println("parameterized Constructor");
//		this.a=v1;
//		this.b=v2;
//		
//	}
	
	public int add() {
		
		int c = a+b;
		return c;
				
	}
	
public int mul() {
		
		int c = a*b;
		return c;
				
	}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

}
