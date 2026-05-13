package pac1;
import java.util.Scanner;
public class strong_number_checker {
	static int factorial(int n)
	{
		if(n==0 || n==1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,val,digit=0,sum=0;
		System.out.println("Enter the number to check: ");
		num=input.nextInt();
		val=num;
		while(val!=0)
		{
			digit=val%10;
			sum=sum+factorial(digit);
			val=val/10;
			
		}
		if(num==sum)
		{
			System.out.println(num+" is a strong number");
		}
		else
		{
			System.out.println(num+" is not a strong number");
		}
		
	}


}
