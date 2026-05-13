package pac1;
import java.util.Scanner;
public class prime_factor_identifer_of_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=input.nextInt();
		
			for(int i=2;i<=num;i++)
			{
				while(num%i==0)
				{
					System.out.print(i+" ");
					num=num/i;
				}
			}
			}


}
