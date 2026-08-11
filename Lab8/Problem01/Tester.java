package problem01;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	try {
		System.out.println("Enter the first number:");
		String val1=input.nextLine();
		double num1=Double.parseDouble(val1);
		System.out.println("Enter the second number:");
		String val2=input.nextLine();
		double num2=Double.parseDouble(val2);
		Calculator obj1=new Calculator(num1,num2);
		obj1.add();
		Calculator obj2=new Calculator(num1,num2);
		obj2.sub();
		Calculator obj3=new Calculator(num1,num2);
		obj3.mul();
		Calculator obj4=new Calculator(num1,num2);
		obj4.div();
		
	} catch (NumberFormatException e) {
		System.out.println("Enter a valid number!");
		
	}

	}

}
