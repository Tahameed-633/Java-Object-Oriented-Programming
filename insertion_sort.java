package pac1;
import java.util.Scanner;
public class insertion_sort {
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
		for(int i=1;i<n;i++)
		{
			int key=ar[i];
			int j=i-1;
			while(j>=0 && ar[j]>key)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
