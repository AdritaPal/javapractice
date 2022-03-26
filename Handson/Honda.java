package Handson;

public class Honda extends Bike {

	
	void run() {
		System.out.println("Abstract method run is implemented.");
	}

	public static void main(String[] args) {
		Bike obj=new Honda();
		obj.run();
	}

}
