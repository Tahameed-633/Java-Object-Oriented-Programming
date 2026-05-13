package pac1;
import java.util.Scanner;
public class find_smallest_element_of_array {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,min;
		n=input.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		min=ar[0];
		for(int i=1;i<n;i++)
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		System.out.println(min);
	}

}
