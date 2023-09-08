
public class App1 {

	public static void main(String[] args) {
		System.out.println("hello world");
		Thread t1=new Thread(new Example1());
		Thread t2=new Thread(new Example2());
		
		t1.start();
		t2.start();
		
	}

}
