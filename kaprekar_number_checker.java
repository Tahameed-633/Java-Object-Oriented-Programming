package pac1;
import java.util.Scanner;
public class kaprekar_number_checker {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,p1,p2,sum,temp,s,cnt,count=0;
		
		System.out.println("Enter the number:");
		num=input.nextInt();
		s=(int)Math.pow(num,2);
		temp=num;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		
		temp=num;
		int d=(int)Math.pow(10, count);
		p1=temp/d;
		p2=temp%d;
		
		sum=p1+p2;
		if(num==sum)
		{
			System.out.println(num+" is a kaprekar number!");
		}
		else
		{
			System.out.println(num+" is not a kaprekar number!");
		}
	}

}
