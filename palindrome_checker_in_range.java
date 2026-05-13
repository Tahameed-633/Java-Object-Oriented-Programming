package pac1;
import java.util.Scanner;
public class palindrome_checker_in_range {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int lr,hr,digit=0;
		System.out.println("Enter the lower range:");
		lr=input.nextInt();
		System.out.println("Enter the higher range:");
		hr=input.nextInt();
		for(int i=lr;i<=hr;i++)
		{
			int reverse=0,temp=i;
			while(temp!=0)
			{
				digit=temp%10;
				reverse=reverse*10+digit;
				temp=temp/10;
			}
			if(i==reverse)
			{
				System.out.println(i+" is a palindrome number!");
			}
			else
			{
				System.out.println(i+" is not a palindrome number!");
			}
		}
	}

}
