import java.util.Scanner;
public class ExcptHand
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char c = 'y';
		do
		{
			System.out.println("Enter your choice:");
			System.out.println("1.Arithmetic operation"); 
			System.out.println("2.Array access");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				try
				{
					System.out.println("Enter the numerator:");
					int a = sc.nextInt();
					System.out.println("Enter the denominator:");
					int b = sc.nextInt();
					int div = a/b;
					System.out.println("Result = "+div);
				}
				catch(ArithmeticException a)
				{
					System.out.println("Exception found : "+a.getMessage());
				}
				break;
			case 2:
				int A[]= {1,2,3,4,5};
				try
				{
					System.out.println("Enter the index of array to access:");
					int index = sc.nextInt();
					System.out.println("The element at index "+index+" is: "+A[index]);
				}
				catch(ArrayIndexOutOfBoundsException i)
				{
					System.out.println("Exception found : "+i.getMessage());
				}
				break;
		   default:
			   System.out.println("Invalid choice");
			   break;
		}
		System.out.println("Do you want to continue? (Y/N):");
		c=sc.next().charAt(0);
	}while(c == 'Y' || c == 'y');
	System.out.println("Successfully executed!!");
	sc.close();
	}
}	
