package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a=10;
		int ab[]=new int[4];
		try {
			System.out.println("rest of the code...");
			ab[0]=1;
			ab[4]=1;//ArrayIndexOutOfBoundException
			System.out.println(a/0);//ArithmeticException

		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());

		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
			finally {
		}
			System.out.println("this is an optional block");
			System.out.println("close any othger db connections or any other");

		}
		System.out.println("rest of the code...");
	}

}
