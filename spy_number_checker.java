package pac1;
import java.util.Scanner;
public class spy_number_checker {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,temp,digit=0,sum=0,mul=1;
		System.out.println("Enter the number to check:");
		num=input.nextInt();
		temp=num;
		while(temp!=0)
		{
			digit=temp%10;
			sum=sum+digit;
			mul=mul*digit*digit;
			temp=temp/10;
		}
		if(sum==mul)
		{
			System.out.println(num+" is a spy number!");
			
		}
		else
		{
			System.out.println(num+" is a spy number!");
		}
	}
}
