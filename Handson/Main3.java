package Handson;

public class Main3 {

	public static void main(String[] args) {
		Car c=new Car("Maruti");
		Car.Wheel1 w1=c.new Wheel1("MRF");
		Car.Wheel2 w2=c.new Wheel2("MRF");
		Car.Wheel3 w3=c.new Wheel3("MRF");
		Car.Wheel4 w4=c.new Wheel4("MRF");
		System.out.println(c.getMake()+":"+ w1.getMake()+","+w2.getMake()+","+w3.getMake()+","+w4.getMake());


	}

}
