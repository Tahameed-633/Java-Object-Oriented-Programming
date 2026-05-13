package pac1;
import java.util.Scanner;
public class reverse_array {
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
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
