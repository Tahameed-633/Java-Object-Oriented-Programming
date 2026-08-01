package pac3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Input_Mismatch_Exception {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		boolean continue_input=true;
		do
		{
			try
			{
				System.out.println("Input an integer value:");
				num=input.nextInt();
				System.out.println("Entered value is an integer.");
				continue_input=false;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input. An Integer is required.");
				input.nextLine();
			}
		}
		while(continue_input);
	}

}
