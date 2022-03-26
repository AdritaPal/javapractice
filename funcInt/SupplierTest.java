package funcInt;

import java.util.function.Supplier;
public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Supplier<Double> s = () -> Math.random();
        System.out.println(s.get());
	}

	
}
