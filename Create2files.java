import java.io.*;
public class CreateNewFile 
{
	public static void main(String[] args)
	{
		try
		{
			File myobj = new File("Filename1.txt");
			File newobj = new File("Filename2.txt");
			if(myobj.createNewFile())
			{
				System.out.println("File 1 successfully created!");
			}
			else
			{
				System.out.println("File 1 already exists!");
			}
			if(newobj.createNewFile())
			{
				System.out.println("File 2 successfully created!");
			}
			else
			{
				System.out.println("File 2 already exists!");
			}
			
		}
		catch(IOException e)
		{
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
	}
}
