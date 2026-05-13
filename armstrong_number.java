package pac1;
import java.util.Scanner;
public class armstrong_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,digit=0;
		double sum=0.0,num1;
		
		System.out.println("Enter the number to check:");
		num=input.nextInt();
		int n=num;
		while(n!=0)
		{
			digit=n%10;
			num1=Math.pow(digit, 3);
			sum=sum+num1;
			n=n/10;
		}
		
		if(num==sum)
		{
			System.out.println(num+" is an armstrong number!");
		}
		else
		{
			System.out.println(num+" is not an armstrong number!");
		}
	}


}
