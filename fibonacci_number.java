package pac1;
import java.util.Scanner;
public class fibonacci_number {
	static int fibonacci(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-2)+fibonacci(n-1);
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Enter the value to generate fibonacci number: ");
		n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(fibonacci(i)+" ");
		}

	}

}
