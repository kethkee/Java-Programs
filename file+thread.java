import java.io.*;
class OddF extends Thread
{
	public void run()
	{
		File obj1 = new File("OddFile.txt");
		try 
		{
			obj1.createNewFile();
			try(FileWriter fout = new FileWriter("OddFile.txt"))
			{
			for(int i=1;i<100;i=i+2)
			{
				fout.write(i+"\n");
			}
			System.out.println("Successfully written");
		}}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	
class EvenF extends Thread
{
	
	public void run()
	{
		File obj2 = new File("EvenFile.txt");
	
		try
		{
			obj2.createNewFile();
			try(FileWriter fout = new FileWriter("EvenFile.txt"))
			{
			for(int i=2;i<=100;i=i+2)
			{
				fout.write(i+"\n");
			}
      System.out.println("Successfully written");
		}}
		catch(Exception e)
		{
			System.out.println(e);
		}
}}
public class Th5
{
	public static void main(String[] args)
	{
		OddF o = new OddF();
		EvenF e = new EvenF();
		o.start();
		e.start();
	}
}
