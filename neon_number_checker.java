package pac1;
import java.util.Scanner;
public class neon_number_checker {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,digit=0,sum=0;
		double sqr;
		System.out.println("Enter the number to check:");
		num=input.nextInt();
		sqr=Math.pow(num,2);
		int val=(int)sqr;
		while(val!=0)
		{
			digit=val%10;
			sum=sum+digit;
			val=val/10;
		}
		if(num==sum)
		{
			System.out.println(num+" is a neon number!");
		}
		else
		{
			System.out.println(num+" is not a neon number!");
		}
		
	}

}
