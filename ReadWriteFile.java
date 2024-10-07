import java.io.*;
public class ReadWriteFile
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("Filename1.txt");
			FileOutputStream fout = new FileOutputStream("Filename2.txt");
			int i;
			while((i = fin.read()) != -1)
			{
				fout.write(i);
			}
			System.out.println("Successfully wrote from first file to the second file");
			fin.close();
			fout.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
