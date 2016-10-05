
import java.util.Scanner;
public class TempConvertion{
    public static void main(String[] args){

            convert(98.6);
            repeatString("Hello", 5);
            System.out.println(Quit());
    }
    public static double TC = 0;
    public static double convert(double TF) {
        TC = (TF - 32) / 1.8;
        System.out.println(TC);
        return TC;
    }
    public static String input = "";
    public static boolean Quit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to Quit");
        input = scanner.nextLine();
        if (input.equals("Yes") || input == "yes" || input == "y"){
            return true;
        } else {
            return false;
        }
    }
    public static String repeatString(String str, int count){
        StringBuilder sb = new StringBuilder(); 
        for( int i = 0; i < count; ++i ){ sb.append(str); }
        System.out.println(sb);
        return sb.toString();

    }
}
