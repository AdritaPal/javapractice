package exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExcepHandle{
	
	static boolean bool=true;

    static void check(String r, String m){
        if(r.length() != 9){
        	bool=false;
            System.out.println("Invalid");
            throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
        }
        if(m.length() != 10){
        	bool=false;

            System.out.println("Invalid");
            throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
        }
        
        	if(!m.matches("^[6|7|8|9]{1}[0-9]+$")) {
            	bool=false;

        		System.out.println("Invalid");
                throw new NumberFormatException ("Mobile number cannot conatin anything except a number");
        	}
            
        
        
        	if(!r.matches("^[1-9]{2}[A-Z]{3}[0-9]{4}$")) {
        		//System.out.println(r.charAt(i));

            	bool=false;
        		System.out.println("Invalid");
                throw new NoSuchElementException ("Reg number cannot conatin anything except a number n alpha");
        	
            
        }
        

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String reg = sc.nextLine();
        String no = sc.nextLine();
        sc.close();
        check(reg, no);
        System.out.println("Valid");
    }
}
