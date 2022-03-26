package exception;

import java.util.*;

class DishNotAvailableException extends Exception{
	
}

class Restaurant{
	
	public boolean order(String dish) throws DishNotAvailableException{
		Random r = new Random();
		if(r.nextInt()%2 == 0) {
			return true;
		}
		else {
			throw new DishNotAvailableException();
		}
	}
	
}

public class Main2 {

	public static void main(String[] args) {
		Restaurant res = new Restaurant();
		try {
			if(!res.order("Masala Dosa")) {
				throw new DishNotAvailableException();
			}
			else {
				res.order("Masla Dosa");
			}
		}catch(DishNotAvailableException e){
			System.out.println(e.toString());
		}finally {
			System.out.println("Bye");
		}
	}

}
