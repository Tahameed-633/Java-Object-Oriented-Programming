package pac4;
import java.util.Scanner;
public class NestedTryCatch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try
		{
			System.out.println("Press an order.....");
			try
			{
				System.out.println("Enter order quantity");
				int qnt=input.nextInt();
				input.nextLine();
				System.out.println("Enter price:");
				String price=input.nextLine();
				int food_price=Integer.parseInt(price);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter a valid number");
			}
			System.out.println("Processing order...");

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("An exception occured");
		}
		System.out.println("Order ready....");
	}

}
