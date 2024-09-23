import java.util.Scanner;
interface Human
{
	final int jobid = 1050;
	void learn(String str);
	void work();
}
interface Recruitment
{
	void screening(int score);
}
class Programmer implements Human,Recruitment
{
	public void learn(String str)
	{
		System.out.println("Trained area : "+str);
	}
	public void screening(int score)
	{
		System.out.println("Test score : "+score);
	}
	public void work()
	{
		System.out.println("Selected to the role : Development");
	}
}
public class Test11 
{

	public static void main(String[] args) 
	{
		Programmer trainee = new Programmer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your trained area : ");
		String str = sc.nextLine();
		System.out.println("Enter test score : ");
		int score = sc.nextInt();
		System.out.println(".....ABOUT MY PLACEMENT....");
		trainee.learn(str);
		trainee.screening(score);
		trainee.work();
		System.out.println("My Job ID is : "+trainee.jobid);
	}

}
