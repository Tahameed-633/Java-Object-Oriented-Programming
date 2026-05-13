package pac1;
import java.util.Scanner;
public class selection_sort {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array:");
		n=input.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the element of the array:");
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(ar[j]<ar[min_index])
				{
					min_index=j;
				}
			}
			if(ar[i]>ar[min_index])
			{
				int temp=ar[i];
				ar[i]=ar[min_index];
				ar[min_index]=temp;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
