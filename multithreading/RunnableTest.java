package multithreading;

public class RunnableTest {

	public static void main(String[] args) {
		RunnableTesting r = new RunnableTesting();
		Thread t = new Thread(r);
		t.start();
	}

}
class RunnableTesting implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Runnable");
	}
	
}