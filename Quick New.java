import java.util.Scanner;

public class Quick
{
	int pivot,start,end,lb,ub,A[],loc,temp,a,b;
	public int partition(int A[],int lb,int ub)
	{
		pivot = A[lb];
		start = lb;
		end = ub;
		while(start < end)
		{
			while(start < end && A[start] <= pivot)
			{
				start++;
			}
			while(A[end] > pivot)
			{
				end--;
			}
		
		if(start < end)
		{
			swap(A,start,end);
		}
		}
		swap(A,lb,end);
		return end;
	}
	public void quicksort(int A[],int lb,int ub)
	{
		if(lb < ub)
		{
			loc = partition(A,lb,ub);
			quicksort(A,lb,loc-1);
			quicksort(A,loc+1,ub);
		}
	}
	public void swap(int A[],int i,int j)
	{
		temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array:");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0; i < n;i++)
		{
			 A[i] = sc.nextInt();
		}
		System.out.println("Before sorting:");
		for(int i = 0; i < n;i++)
		{
			 System.out.print(A[i]+" "); 
		}
		System.out.println();
		Quick q = new Quick();
		q.quicksort(A,0,n-1);
		System.out.println("After sorting:");
		
		for(int i = 0; i < n;i++)
		{
			 System.out.print(A[i]+" "); 
		}
		
	}
}
