package oops;

public class test {

	public static void main(String[] args) {
		
		
		OopsClass obj = new OopsClass();
		
		
		obj.setA(10);
		obj.setB(12);
		
		int a = obj.add();
		int b=obj.mul();
		
		System.out.println(a+"\n"+b);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
	}

}
