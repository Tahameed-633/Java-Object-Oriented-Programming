package Problem02;
import java.util.Scanner;
public class Fruit {

	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.fruitPrice();

	}
	public void fruitPrice()
	{
		Scanner input=new Scanner(System.in);
		
		double price,weight;
		 System.out.println("Enter fruit weight:");
		 weight=input.nextDouble();
		 System.out.println("Enter fruit price:");
		 price=input.nextDouble();
		try
		{
			if(price/weight<50)
			{
				throw new FruitException("Available Fruit!");
			}
			else if(price/weight>500)
			{
				throw new FruitException("Rare Fruit!");
			}
			else
			{
				System.out.println("Fruit Price="+weight*price);
			}
		}
		catch(FruitException fe)
		{
			System.out.println(fe.getMessage());
		}
	}

}
