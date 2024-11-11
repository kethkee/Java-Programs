class ThA extends Thread
{
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println("Thread A"+i);
		}
		System.out.println("Exiting thread A");
	}
}
class ThB extends Thread
{
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println("Thread B"+i);
		}
		System.out.println("Exiting thread B");
	}
}
class ThC extends Thread
{
	public void run()
	{
		for(int i =0;i<5;i++)
		{
			System.out.println("Thread C"+i);
		}
		System.out.println("Exiting thread C");
	}
}
public class Th3
{
	public static void main(String[] args)
	{
		ThA t1 = new ThA();
		ThB t2 = new ThB();
		ThC t3 = new ThC();
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t1.getPriority()+1);
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("A started");
		t1.start();
		System.out.println("B started");
		t2.start();
		System.out.println("C started");
		t3.start();
	}
}
