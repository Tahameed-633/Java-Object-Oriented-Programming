package pac1;
import java.util.Scanner;
public class find_number_of_digits_of_given_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int val,digit=0,count=0;
		System.out.println("Enter the number: ");
		val=input.nextInt();
		while(val!=0)
		{
			digit=digit%10;
			count++;
			val=val/10;
		}
		System.out.println("Number of digits="+count);
	}


}
