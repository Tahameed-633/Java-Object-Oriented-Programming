package pac1;
import java.util.Scanner;
public class find_smallest_digit_of_a_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,digit=0,val,min,count=0;
		System.out.println("Enter the value:");
		num=input.nextInt();
		val=num;
		while(val!=0)
		{
			count++;
			val=val/10;
		}
		val=num;
		int ar[]=new int[count];
		
		for(int i=count-1;i>=0;i--)
		{
			digit=val%10;
			ar[i]=digit;
			val=val/10;
		}
		val=num;
		min=ar[0];
		for(int i=0;i<count;i++)
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
			
			val=val/10;
		}
		System.out.println("Smallest digit="+min);
	}

}
