import java.util.Scanner;
public class Palin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int len = str.length();
        int flag = 0;
        for(int i = 0;i<len/2;i++)
        {
            if(str.charAt(i)!=str.charAt(len-i-1))
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("The word "+str+" is a palindrome.");
        }
        else
        {
            System.out.println("The word "+str+" is not a palindrome.");
        }
    }
}
