package exception;

public class CustomExceptionExamples {

	public static void main(String[] args) {
		
		try {
				throw new ExceptionC();
		}catch(ExceptionC C) {
			System.out.println(C.getMessage());
		}try {
			throw new ExceptionB();
		}catch(ExceptionB B) {
			System.out.println(B.getMessage());
		}try {
			throw new ExceptionA();
		}catch(ExceptionA A) {
			System.out.println(A.getMessage());
		} 
	}
	

}
class ExceptionA extends Exception{
	public String getMessage() {
		String s="Exception A is handled";
		return s;
	}
}
class ExceptionB extends ExceptionA{
	public String getMessage() {
		return "ExceptionB is handled";
	}
}
class ExceptionC extends ExceptionB{
	public String getMessage() {
		return "ExceptionC is handled";
	}
}
