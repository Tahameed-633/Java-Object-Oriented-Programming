package pac1;
import java.util.Scanner;
public class least_common_factor {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int val1,val2,gcd=0;
		System.out.println("Enter the larger value: ");
		val1=input.nextInt();
		System.out.println("Enter the smaller value: ");
		val2=input.nextInt();
		for(int i=1;i<=val2;i++)
		{
			if(val1%i==0 && val2%i==0)
			{
				gcd=i;
			}
		}
		int lcm=(val1*val2)/gcd;
		System.out.println("Least common multiple: "+lcm);
	}



}
