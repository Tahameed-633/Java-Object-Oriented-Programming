package pac1;
import java.util.Scanner;
public class count_digits_of_factorial {
	static int factorial(int n)
	{
		if(n==1 || n==0)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int fac,count=0,n;
		System.out.println("Enter the number to determine factorial:");
		n=input.nextInt();
		fac=factorial(n);
		int val=fac;
		while(val!=0)
		{
			count++;
			val/=10;
		}
		System.out.println(n+"'s factorial is: "+fac);
		System.out.println("Number of digits of factorial: "+count);
	}


}
