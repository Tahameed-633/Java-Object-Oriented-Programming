package pac1;
import java.util.Scanner;
public class automorphic_number_checker {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,digit=0,temp;
		double val;
		System.out.println("Enter the number to check:");
		num=input.nextInt();
		temp=num;
		digit=temp%10;
		val=Math.pow(digit, 2);
		if(num==val)
		{
			System.out.println(num+" is an automorphic number!");
		}
		else
		{
			System.out.println(num+" is not an automorphic number!");
		}
	}

}
