package pac1;
import java.util.Scanner;
public class replace_all_0_of_a_number_with_1 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,temp,digit=0,count=0;
		System.out.println("Enter the number:");
		num=input.nextInt();
		temp=num;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		temp=num;
		int ar[]=new int[count];
		for(int i=count-1;i>=0;i--)
		{
			digit=temp%10;
			if(digit==0)
			{
				digit=1;
			}
			for(int j=count-1;j>=0;j--)
			{
				ar[i]=digit;
			}
			temp/=10;
		}
		for(int i=0;i<count;i++)
		{
			System.out.print(ar[i]);
		}
	}

}
