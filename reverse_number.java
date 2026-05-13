package pac1;
import java.util.Scanner;
public class reverse_number {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num,n=0,m=0;
		System.out.println("Enter the number to reverse: ");
		num=input.nextInt();
		while(num!=0)
			{	
			
			n=num%10;
			m=m*10+n;
			num=num/10;
			
		}
		System.out.println("Reversed number= "+m);
	}



}
