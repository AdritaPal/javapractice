package package1;

import java.util.*;

public class MyClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String register = sc.nextLine();
		String phone= sc.nextLine();
		boolean reg,ph;
		boolean bool=true;
		String msg="";
		try {
			reg=MyClass.checkRegister(register);
		}
		catch(Exception e)
		{
			bool=false;
			msg=e.toString();
		}
		
		try {
			ph=MyClass.checkPhone(phone);
		}
		catch(Exception e)
		{
			bool=false;
			msg=e.toString();
		}
		if(bool)
			System.out.println("Valid");
		else
			System.out.println("Invalid"+"\n"+msg);
		
	}
	public static boolean checkRegister(String num) throws Exception
	{
		boolean boo=true;
		if(num.length()!=9)
		{
			boo=false;
			throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
		}
		else
		{
			if(Character.isDigit(num.charAt(0)) && Character.isDigit(num.charAt(1)) 
					&& Character.isAlphabetic(num.charAt(2)) && Character.isAlphabetic(num.charAt(3)) && Character.isAlphabetic(num.charAt(4))
					&& Character.isDigit(num.charAt(5)) && Character.isDigit(num.charAt(6)) && Character.isDigit(num.charAt(7)) && Character.isDigit(num.charAt(8)))
			{
				boo=true;
			}
			else
			{
				boo=false;
				throw new NoSuchElementException("Registration Number cannot contain any character other than digits and alphabets");
			}
		}
		return boo;
	}
	
	public static boolean checkPhone(String num) throws Exception
	{
		boolean boo = true;
		if(num.length()!=10)
		{
			boo=false;
			throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
		}
		else
		{
			for(int i=0;i<num.length();i++) {
				if(Character.isDigit(num.charAt(i)))
				{
					boo=true;
				}
				else
				{
					boo=false;
					throw new NumberFormatException("Mobile Number cannot contain any character other than a digits");
				}
			}
		}
		return boo;
	}
}
