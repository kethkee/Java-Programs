class M5 extends Thread
{
	public void run()
	{
		for(int i=1;i<101;i++)
		{
			System.out.println(5*i);
			
		}
		System.out.println("Thread1 stopped");
	}
}
class M10 extends Thread
{
	public void run()
	{
		for(int i=1;i<101;i++)
		{
			System.out.println(10*i);
			
		}
		System.out.println("Thread2 stopped");
	}
}
public class Thr1
{
	public static void main(String[] args)
	{
		M5 t1 = new M5();
		M10 t2 = new M10();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread 1 started");
		t1.start();
		System.out.println("Thread 2 started");
		t2.start();
	}
}
