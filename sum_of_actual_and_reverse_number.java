package pac1;
import java.util.Scanner;
public class sum_of_actual_and_reverse_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,val,digit=0,reverse=0;
		System.out.println("Enter the number:");
		num=input.nextInt();
		val=num;
		while(num!=0)
		{
			digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		System.out.println("Reversed number="+reverse);
		int sum=val+reverse;
		System.out.println("Sum="+sum);
	}

}
