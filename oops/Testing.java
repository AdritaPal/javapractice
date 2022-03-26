package oops;

public class Testing {

	public static void main(String[] args) {
		
		Car mrt = new MarutiSuzuki();
		Car Tata = new Tata();
		
		mrt.getEngineDetails();
		mrt.getModel();
		mrt.getVersion();
		
		Tata.getEngineDetails();
		Tata.getModel();
		Tata.getVersion();
	}

}
