package Pac1;
import java.util.Scanner;

public class MathematicalFunction {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double x3 = input.nextDouble();
            double y3 = input.nextDouble();

            // Corrected formula for distance calculation
            double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
            System.out.print(a);
        }
    }
}
