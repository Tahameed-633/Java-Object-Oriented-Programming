package pac1;
import java.util.Scanner;
public class square_of_each_digit_of_the_reverse_of_given_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,reverse=0,digit=0,temp,count=0;
		System.out.println("Enter the number:");
		num=input.nextInt();
		temp=num;
		while(temp!=0)
		{
			count++;
			digit=temp%10;
			reverse=reverse*10+digit;
			temp=temp/10;
		}
		System.out.println("Reversed number: "+reverse);
		temp=num;
		for(int i=1;i<=count;i++)
		{
			digit=temp%10;
			System.out.print("Square of each edigit in reverse:\n");
			System.out.println(Math.pow(digit,2));
			temp=temp/10;
		}
	}


}
