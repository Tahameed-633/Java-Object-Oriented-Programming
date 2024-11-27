import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		int lottery=(int)(Math.random()*100);
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number(two digit) you guess: ");
		int guess=input.nextInt();
		int lotterydigit1=lottery/10;
		int lotterydigit2=lottery%10;
		int guessdigit1=guess/10;
		int guessdigit2=guess%10;
		if(guess==lottery)
		{
			System.out.println("All digit matches according to correct order and you have earned $10,000");
		}
		else if(guessdigit1==lotterydigit2&&guessdigit2==lotterydigit1)
		{
			System.out.println("All digit matches and you have earned $3000");
		}
		else if(guessdigit1==lotterydigit2||guessdigit2==lotterydigit2||guessdigit1==lotterydigit1||guessdigit2==lotterydigit1)
		{
			System.out.println("One digit matches and you have earned $1000");
		}
		else
		{
			System.out.println("Sorry! No match found!");
		}

	}

}
