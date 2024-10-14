import java.util.*;
import java.io.*;
public class FReaderWriter
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			File obj1 = new File("Register1.txt");
			obj1.createNewFile();
			System.out.println("Register1.txt created\n");
			FileWriter fout = new FileWriter("Register1.txt");
			System.out.println("Register1.txt");
			System.out.println("Enter your KEAM rank: ");
			int n = sc.nextInt();
			fout.write(n+ "\n");
			fout.close();
			System.out.println("Data added!");
			FileReader fin = new FileReader("Register1.txt");
			BufferedReader br = new BufferedReader(fin);
			String line;
			System.out.println("\nContent of Register1.txt is:");
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			br.close();
		}	
			catch (IOException e)
			 {
			 System.out.println("Exception occured: " +e.getMessage());
			 
		}
	}
}
