
public class DemoLambda {

	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("ONE");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<20;i++)
			{
				System.out.println("TWO");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
