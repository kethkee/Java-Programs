import java.util.Scanner;
public class Matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order-m1: ");
        int m1 = sc.nextInt();
        System.out.println("Enter the order-n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the order-m2: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the order-n2: ");
        int n2 = sc.nextInt();
        if(n1!=m2)
        {
            System.out.println("Matrix multiplication not possible.");
        }
        int A[][] = new int[m1][n1];
        int B[][] = new int[m2][n2];
        int C[][] = new int[m1][n2];
        System.out.println("Read matrix A:\n");
        for(int i= 0;i<m1;i++)
        {
            for(int j = 0;j<n1;j++)
            {
                System.out.println("A["+i+"]["+j+"]=");
                A[i][j] = sc.nextInt();
                
            }
        }
        System.out.println("Read matrix B:\n");
        for(int i =0;i<m2;i++)
        {
            for(int j = 0;j<n2;j++)
            {
               System.out.println("B["+i+"]["+j+"]=");
               B[i][j] = sc.nextInt();
                
            }
        }
        for(int i = 0;i<m1;i++)
        {
            for(int j =0;j<n2;j++)
            {
                C[i][j] = 0;
                for(int k = 0;k<n1;k++)
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Matrix A\n");
        for(int i = 0;i<m1;i++)
        {
            for(int j =0;j<n1;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i = 0;i<m2;i++)
        {
            for(int j =0;j<n2;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Matrix C\n");
        for(int i = 0;i<m1;i++)
        {
            for(int j =0;j<n2;j++)
            {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
