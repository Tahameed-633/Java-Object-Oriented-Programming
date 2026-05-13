package pac1;
import java.util.Scanner;
public class find_maximum_element_of_array {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,max=0;
		n=input.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(max);
	}

}
