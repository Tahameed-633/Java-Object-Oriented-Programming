package pac1;
import java.util.Scanner;
public class odd_even_number_checker_in_range {
	public static void main( String args[])
	{
	Scanner input=new Scanner(System.in);	
	int lr,hr;
		System.out.println("Enter lower range: ");
		lr=input.nextInt();
		System.out.println("Enter higher range: ");
		hr=input.nextInt();
		for(int i=lr;i<=hr;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ " is an even number");
			}
			else
			{
				System.out.println(i+" is an odd number.");
			}
		}
		
		
	}


}
