package pac1;
import java.util.Scanner;
public class find_2nd_largest_digit_of_a_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,val,digit=0,count=0,f_max=Integer.MIN_VALUE,s_max=Integer.MIN_VALUE;
		System.out.println("Enter the number:");
		num=input.nextInt();
		val=num;
		while(val!=0)
		{
			count++;
			val=val/10;
		}
		int ar[]=new int[count];
		val=num;
		for(int i=count-1;i>=0;i--)
		{
			digit=val%10;
			ar[i]=digit;
			val=val/10;
		}
		for(int i=0;i<count;i++)
		{
			if(ar[i]>f_max)
			{
				f_max=ar[i];
			}
		}
		
		for(int i=0;i<count;i++)
		{
			if(ar[i]<f_max && ar[i]>s_max)
			{
				s_max=ar[i];
				
			}
		}
		System.out.println("Second largest digit="+s_max);
		
	}


}
