package pac1;
import java.util.Scanner;
public class linear_search {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,key;
	boolean found=false;
		System.out.println("Enter the size of the array:");
		n=input.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		System.out.println("Enter the number to search:");
		key=input.nextInt();
		for(int i=0;i<n;i++)
		{
			if(ar[i]==key)
			{
				System.out.println("Found at index:"+i);
				found=true;
				break;
			}
			if(!found)
			{
				System.out.println("Element not found!");
			}
			
		}
	}

}
