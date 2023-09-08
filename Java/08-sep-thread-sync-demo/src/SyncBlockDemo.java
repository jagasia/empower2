class A
{	
	public void displayNumbers() throws InterruptedException
	{
		System.out.println("Display numbers method started by "+Thread.currentThread().getName());
		for(int i=0;i<3;i++)
		{
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		synchronized (this) {
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
		System.out.println(Thread.currentThread().getName()+" exited the display num method");
		
	}
}
class MyThread extends Thread
{
	A a;
	public MyThread(A a)
	{
		this.a=a;
	}
	public void run()
	{
		try {
			a.displayNumbers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class SyncBlockDemo {

	public static void main(String[] args) {
		A a=new A();
		MyThread t1=new MyThread(a);
		MyThread t2=new MyThread(a);
		
		t1.setName("Chenna");
		t2.setName("Sushwanth");
		t2.setPriority(10);
		t1.start();
		t2.start();
		
	}

}
