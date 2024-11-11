import java.io.*;
import java.util.*;
public class file1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		File obj1 = new File("EvenNum.txt");
		File obj2 = new File("OddNum.txt");
		File obj3 = new File("Merge.txt");
		try
		{
			obj1.createNewFile();
			obj2.createNewFile();
			obj3.createNewFile();
			FileWriter fout1 = new FileWriter("EvenNum.txt");
			FileWriter fout2 = new FileWriter("OddNum.txt");
			FileWriter fout3 = new FileWriter("Merge.txt");
			int n1,n2;
			System.out.println("Enter the range of even numbers:");
			n1 = sc.nextInt();
			System.out.println("Enter the range of odd numbers:");
			n2 = sc.nextInt();
			for(int i=1;i<n1;i++)
			{
				if(i%2==0) 
				{
				fout1.write(i+"\n");
				}
			}
			System.out.println("Even numbers added!");
			for(int i=1;i<n2;i++)
			{
				if(i%2 != 0)
				{
				fout2.write(i+"\n");
				}
			}
			System.out.println("Odd numbers added!");
			fout1.close();
			fout2.close();
			FileReader fin1 = new FileReader("EvenNum.txt");
			FileReader fin2 = new FileReader("OddNum.txt");
			BufferedReader br1 = new BufferedReader(fin1);
			BufferedReader br2 = new BufferedReader(fin2);
			String line1,line2;
			while((line1 = br1.readLine()) != null)
			{
				fout3.write(line1+"\n");
			}
			while((line2 = br2.readLine()) != null)
			{
				fout3.write(line2+"\n");
			}
			System.out.println("Successfully merged!");
			fin1.close();
			fin2.close();
			fout3.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
