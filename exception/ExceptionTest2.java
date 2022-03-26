package exception;

class Exception1 extends Exception{
	public String getMessage() {
		return "ONE";
	}
}

class Exception2 extends Exception1{
	public String getMessage() {
		return "TWO";
	}
}
public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			throw new Exception1();
		}catch(Exception2 e2){
			System.out.println(e2.getMessage());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());

		}
	}

}
