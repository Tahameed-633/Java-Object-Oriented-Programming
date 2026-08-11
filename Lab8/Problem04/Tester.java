package Problem04;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) throws MyException  {
	 String str;
	 int size;
	 double num1,num2;
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter dividant:");
	 num1=input.nextDouble();
	 System.out.println("Enter divisee:");
	 num2=input.nextDouble();
	 try
	 {
		
		 if(num2==0)
		 {
			 throw new MyException("Invalid Divison!");
		 }
		 double result=num1/num2;
	 }
	 catch(MyException e)
	 {
		 System.out.println(e.getMessage());
	 }
	 try
	 {	input.nextLine();
		 System.out.println("Input a string:");
		 str=input.nextLine();
		 
		 System.out.println("Enter the index to print:");
		 int index=input.nextInt();
		
		 if(index>=str.length() || index<0)
		 {
			 throw new MyException("Index is invalid");
		 }
		 System.out.println(str.charAt(index));
	 }
	 catch(MyException e)
	 {
		 System.out.println(e.getMessage());
	 }
	 try
	 {
		 System.out.println("Enter the size of the array:");
		 size=input.nextInt();
		 int ar[]=new int[size];
		 System.out.println("Enter the element of the array:");
		 for(int i=0;i<size;i++)
		 {
			 ar[i]=input.nextInt();
		 }
		 System.out.println("Enter the index of the array:");
		 int ind=input.nextInt();
		
		 if(ind>=size || ind<0)
		 {
			 throw new MyException("Array index is invalid");
		 }
		 System.out.println(ar[ind]);
		  }
	 catch(MyException e)
	 {
		 System.out.println(e.getMessage());
	 }
	 try
	 {
		 input.nextLine();
		 System.out.println("Enter an integer:");
		 String val=input.nextLine();
		 int num=Integer.parseInt(val);
		 System.out.println("The number is:"+num);
		 
	 }
	 catch(NumberFormatException e)
	 {
	 throw new MyException("Format mismatch");
	 }

	}

}
