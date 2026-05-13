package pac1;
import java.util.Scanner;
public class disarium_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,count=0,digit=0,temp;
		double sum=0;
		System.out.println("Enter the number to check:");
		num=input.nextInt();
		temp=num;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		for(int i=count; i>=1;i--)
		{
			digit=temp%10;
			sum=sum+Math.pow(digit, i);
			temp=temp/10;
		}
		int val=(int)sum;
		if(num==val)
		{
			System.out.println(num+" is a disarium number!");
		}
		else
		{
			System.out.println(num+" is not a disarium number!");
		}
	}


}
