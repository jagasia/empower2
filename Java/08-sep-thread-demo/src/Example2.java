
public class Example2 implements Runnable
{

	@Override
	public void run() {
		for(int i=2;i<=40;i+=2)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Even");
			
		}
	}

}
