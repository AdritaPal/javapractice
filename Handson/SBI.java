package Handson;

public class SBI implements Bank {

	
	public float ROI() {
		return 4.5f;
	}

	public static void main(String[] args) {
		Bank obj=new SBI();
		System.out.println("Rate of interest: "+obj.ROI());

	}

}
