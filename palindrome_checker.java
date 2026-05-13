package pac1;
import java.util.Scanner;
public class palindrome_checker {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,digit=0,val,reverse=0;
		System.out.println("Enter the number to check: ");
		num=input.nextInt();
		val=num;
		while(val!=0)
		{
			digit=val%10;
			reverse=reverse*10+digit;
			val=val/10;
		}
		if(num==reverse)
		{
			System.out.println(num+" is a palindrome number!");
	}
		else
		{
			System.out.println(num+" is not a palindrome number!");
		}

}

}
