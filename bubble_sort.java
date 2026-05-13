package pac1;
import java.util.Scanner;
public class bubble_sort {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
