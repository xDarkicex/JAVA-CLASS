import java.util.Random;
import java.util.Scanner;
public class Gpa{
    public static void main(String[] args){
        final int SIZE = 5;
        Random rando = Random()

        Scanner scanner = new Scanner(System.in);
        int[] gpa = new int[SIZE];
        String[] names = new String[SIZE];
        String[] stageName = {"The Rock", "The Ocelot", "The Full PAckage", "The Dream", "The Red Rocket"};


        for (int i = 0; i < SIZE; i++){
            System.out.print("Enter a Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Your GPA is: ");
            gpa[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Name\t\t\tGPA\n====================================");
        for (int i = 0; i < SIZE; i++){
        System.out.println(names[i] + " " + stageName[rando.nextInt(5)] + "\t" + gpa[i]);
        }

    }

}