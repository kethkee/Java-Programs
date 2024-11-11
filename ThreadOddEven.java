class Odd implements Runnable
{
	public void run()
	{
		System.out.println("Odd thread started");
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
class Even implements Runnable
{
	public void run()
	{
		System.out.println("Even thread started");
		for(int i=2;i<=100;i++)
		{
			System.out.println(i);
		}
	}
}
public class Th4
{
	public static void main(String[] args)
	{
		Thread T1 = new Thread(new Odd());
		Thread T2 = new Thread(new Even());
		T1.start();
		T2.start();
	}
}
