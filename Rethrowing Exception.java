package pac3;
import java.util.Scanner;
public class Rethrowing_Exception {
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	int num1,num2;
	System.out.println("Enter the divisee:");
	num1=input.nextInt();
	System.out.println("Enter the divisor:");
	num2=input.nextInt();
	try
	{
		divide(num1,num2);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divisor can't be zero.");
		System.out.println("Caught in main().");
	}
}
public static void divide(int num1,int num2)
{
	try
	{
		double result=num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divisor can't be zero.");
		System.out.println("Cautht in divide()");
		throw e;
	}
}
}
