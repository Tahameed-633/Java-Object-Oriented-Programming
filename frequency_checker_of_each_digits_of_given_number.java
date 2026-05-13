package pac1;
import java.util.Scanner;
public class frequency_checker_of_each_digits_of_given_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,val,digit=0,count=0;
		System.out.println("Enter the number:");
		num=input.nextInt();
		val=num;
		while(val!=0)
		{
			count++;
			val/=10;
		}
		val=num;
		int ar[]=new int[count];
		for(int i=count-1;i>=0;i--)
		{
			digit=val%10;
			ar[i]=digit;
			val/=10;
		}
		boolean visited[]=new boolean[count];
		int freq;
		for(int i=0;i<count;i++)
		{
			if(visited[i])
			{
				continue;
			}
			freq=1;
			for(int j=i+1;j<count;j++)
			{
				if(ar[j]==ar[i])
				{
					visited[j]=true;
					freq++;
				}
				
			}
			System.out.println("Frequency of "+ar[i]+"="+freq);
		}
		}

}
