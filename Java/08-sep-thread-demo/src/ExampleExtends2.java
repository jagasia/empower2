
public class ExampleExtends2 extends Thread{

	public void run() {
		for(int i=1;i<=30;i+=2)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("WHITE");
			
		}
	}

}
