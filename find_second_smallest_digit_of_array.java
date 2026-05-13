package pac1;
import java.util.Scanner;
public class find_second_smallest_digit_of_array {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n,f_min=Integer.MAX_VALUE,s_min=Integer.MAX_VALUE;
		n=input.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]<f_min)
			{
				f_min=ar[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]<s_min && ar[i]>f_min)
			{
				s_min=ar[i];
			}
		}
		System.out.println(f_min);
		System.out.println(s_min);
	}

}
