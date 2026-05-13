package pac1;
import java.util.Scanner;
public class find_largest_digit_of_given_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int val,digit=0,count=0,max=0,temp;
		System.out.println("Enter the number:");
		val=input.nextInt();
		temp=val;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
			int ar[]=new int[count];
			temp=val;
			for(int i=count-1;i>=0;i-- )
			{
				ar[i]=temp%10;
				temp=temp/10;
			}
			for(int i=0;i<count;i++)
			{
				if(ar[i]>max)
				{
					max=ar[i];
					
				}
			}
			System.out.println("Largest digit="+max);
			
		}

}
