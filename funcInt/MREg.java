package funcInt;

import java.util.function.Supplier;

public class MREg {

	public static void main(String[] args) {
		MREg object=new MREg();
		// TODO Auto-generated method stub
		Supplier<String> sup=object::Hello;
		System.out.println(sup.get());
		

	}
	public String Hello(){
		
		return "Hello guys" ;
	}
}
