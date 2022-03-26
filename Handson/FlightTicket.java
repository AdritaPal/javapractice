package Handson;

public class FlightTicket {
	Date departureDate;
	Time departureTime;
	
	public FlightTicket() {
		
		departureDate= new Date();
		departureTime=new Time();
	}
	
	byte noOfTickets, typeOfCabin;
	double price=100,totalPrice;
	
	void getDepartureDate(byte d, byte m, short y) {
		System.out.println("Departure Date: "+departureDate.day+"/"+departureDate.month+"/"+departureDate.year);
	}
	void setDepartureDate(byte d, byte m, short y) {
		departureDate.day=d;
		departureDate.month=m;
		departureDate.year=y;
		
	}

}
