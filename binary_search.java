package pac1;
import java.util.Scanner;
public class binary_search {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,key,l,h,mid;
	boolean found=false;
		System.out.println("Enter the size of the array:");
		n=input.nextInt();
		int ar[]=new int[n];
		l=0;
		h=n-1;
		
		System.out.println("Enter the element of the array:");
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		System.out.println("Enter the number to search:");
		key=input.nextInt();
		while(l<=h)
		{
			mid=(l+h)/2;
			if(ar[mid]==key)
			{
				System.out.println("Element found at index:"+mid);
				found=true;
				break;
			}
			if(ar[mid]>key)
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
			
		}
		
		if(!found)
		{
			System.out.println("Element not found!");
		}
	}

}
