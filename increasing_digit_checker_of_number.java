package pac1;
import java.util.Scanner;
public class increasing_digit_checker_of_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,temp,count=0,digit=0;
		boolean is_increasing=true;
		System.out.println("Enter the number to check:");
		num=input.nextInt();
		temp=num;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		temp=num;
		int ar[]=new int[count];
		for(int i=count-1;i>=0;i--)
		{
			digit=temp%10;
			ar[i]=digit;
			temp/=10;
		}
		for(int i=0;i<count-1;i++)
		{
			if(ar[i+1]<=ar[i])
			{
				is_increasing=false;
				break;
			}
		}
		if(is_increasing)
		{
			System.out.println("Correct! The digits of the number are increasing!");
		}
		else
		{
			System.out.println("Incorrect! The digits of the number are not increasing!");
		}
	}

}
