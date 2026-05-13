package pac1;
import java.util.Scanner;
public class sum_of_digits_of_given_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int val,digit=0,sum=0;
		System.out.println("Enter the number: ");
		val=input.nextInt();
		while(val!=0)
		{
			digit=val%10;
			sum=sum+digit;
			val=val/10;
		}
		System.out.println("Sum of digits="+sum);
	}

}
