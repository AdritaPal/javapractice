package oops;

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class ICICI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}

class HDFC{
	int getRateOfInterest() {
		return 10;
	}
}
public class Overriding {

	public static void main(String[] args) {
		ICICI ic=new ICICI();
		System.out.println(ic.getRateOfInterest());
		
		HDFC hd= new HDFC();
		System.out.println(hd.getRateOfInterest());
		
	}

}
