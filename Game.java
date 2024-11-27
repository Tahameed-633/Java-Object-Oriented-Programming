import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        //Game1();
        Game2();
    }
    public static void Game1()
    {
    Scanner input = new Scanner(System.in);
    int answer = (int) (Math.random() * 3);
    System.out.println("Enter a number between 0, 1, and 2 (0 for Scissor, 1 for Rock, 2 for Paper): ");
    int guess = input.nextInt();

    if (answer == 0) {
        System.out.println("The computer is Scissor");
    } else if (answer == 1) {
        System.out.println("The computer is Rock");
    } else if (answer == 2) {
        System.out.println("The computer is Paper");
    }

    if (guess == answer) {
        System.out.println("It's a tie!");
    } else if ((guess == 0 && answer == 1) || (guess == 1 && answer == 2) || (guess == 2 && answer == 0)) {
        System.out.println("You lose!");
    } else {
        System.out.println("You win!");
    }
   }
    public static void  Game2()
    {
    	int index=(int)(Math.random()*53);
    	String[] ranks= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    	String[] suits= {"Clubs","Dimantions","Hearts","Spades"};
    	int String_rank=index%13;
    	int String_suit=index/13;
    	String rank =ranks[String_rank];
    	String suit=suits[String_suit];
    	System.out.println("You picked the card was "+rank+" of "+suit);
    }
}
