package pac1;
import java.util.Scanner;
public class perfect_number_checker {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter the number to check:");
		num=input.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println(num+" is a perfect number!");
		}
		else
		{
			System.out.println(num+" is not a perfect number!");
		}
	}

}
