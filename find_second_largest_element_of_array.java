package pac1;
import java.util.Scanner;
public class find_second_largest_element_of_array {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,f_max=Integer.MIN_VALUE,s_max=Integer.MIN_VALUE;
		n=input.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]>f_max)
			{
				f_max=ar[i];
			}
		}
		System.out.println(f_max);
	for(int i=0;i<n;i++)
	{
		if(ar[i]>s_max && ar[i]<f_max)
		{
			s_max=ar[i];
		}
	}
	System.out.println(s_max);
	}

}
