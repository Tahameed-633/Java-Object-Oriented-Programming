package pac1;
import java.util.Scanner;
public class niven_number_checker {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,f_digit=0,l_digit=0,temp,sum,val;
		System.out.println("Enter the number to check: ");
		num=input.nextInt();
		temp=num;
		l_digit=temp%10;
		while(temp!=0)
		{
			f_digit=temp%10;
			temp=temp/10;
		}
		sum=f_digit+l_digit;
		if(num%sum==0)
		{
			System.out.println(num+" is a niven number!");
		}
		else
		{
			System.out.println(num+" is not a niven number!");
		}
	}

}
