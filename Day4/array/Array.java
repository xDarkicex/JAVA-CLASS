import java.util.Random;
import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        final int SIZE = 5;
        double total = 0;

        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[SIZE];

        for (double i = 0; i < scores.length; i++){
            System.out.print("Enter a Score: ");
            scores[i] = scanner.nextLong();
            total += scores[i];

        }

        System.out.printf("Average %f%n.", total / scores.length);
    }

}