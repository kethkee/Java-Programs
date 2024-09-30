import java.util.Scanner;
class AgeException extends Exception
{
	public AgeException(String message)
	{
		super(message);
	}
}
public class CustomHand
{
	public static void validateAge(int age) throws AgeException
	{
		if(age < 18)
		{
			throw new AgeException("Age must be about 18 years old.");
		}
		else
		{
			System.out.println("Age is valid : "+age);
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eligibility test for Election Voting");
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		
		try
		{
			validateAge(age);
		}
		catch (AgeException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		finally
		{
			System.out.println("I am finally block ... I am always here ...");
			
		}
		scanner.close();
	}
}
