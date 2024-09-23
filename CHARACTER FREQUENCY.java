import java.util.Scanner;
public class Freq
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		System.out.println("Enter a characetr:");
		char ch = sc.nextLine().charAt(0);
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i) == ch)
			{
				count++;
			}
		}
		System.out.println("The character "+ch+" occurred "+count+" times.");
	}
}
