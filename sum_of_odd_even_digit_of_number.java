package pac1;
import java.util.Scanner;
public class sum_of_odd_even_digit_of_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,val,sum_odd=0,sum_even=0,digit=0,count=0;
		System.out.println("Enter the value:");
		num=input.nextInt();
		val=num;
		while(val!=0)
		{
			
			count++;
			val=val/10;
		}
		val=num;
		for(int i=1;i<=count;i++)
		{
			digit=val%10;
			if(digit%2==0)
			{
				sum_even=sum_even+digit;
			}
			else
			{
				sum_odd=sum_odd+digit;
			}
			val=val/10;
		}
		System.out.println("Sum of even numbers:"+sum_even);
		System.out.println("Sum of odd numbers:"+sum_odd);
	}

}
