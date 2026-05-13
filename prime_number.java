package pac1;
import java.util.Scanner;
public class prime_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num;
		boolean is_prime=false;
		System.out.println("Enter the value to check: ");
		num=input.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i!=0)
			{
				is_prime=true;
			}
		}
		if(is_prime)
		{
			System.out.println(num+" is a prime number!");
		}
		else
		{
			System.out.println(num+" is not a prime number!");
		}
		
	}


}
