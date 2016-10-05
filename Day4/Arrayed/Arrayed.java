import java.util.Arrays;
import java.util.List;
public class Arrayed{
    public static void main(String[] args){
         int[] myArray = {5,4,3,6,8};
        getAverage(myArray);
        getHighest(myArray);
       
        greater(myArray, 5);

    }
    public static double getAverage(int[] scores){
        int total = 0;
        // int[] scores = {68, 94, 79, 89, 57};
        for (int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        System.out.printf("Average %d%n.", total / scores.length);
        return total / scores.length;
    }

    public static int getHighest(int[] scores){
        // int[] scores = {68, 94, 79, 89, 57};
        int max = scores[0];
        for (int n : scores){
            if (n > max){
                max = n;
            }
        }
        // System.out.println(max);
        return max;
    }
 public static int[] greater(int[] a, int val){
    int[] greater = new int[a.length];
    int greaterNumber = 0;
    for (int i = 0; i < greater.length; i++){
        if (a[i] < val)
            greater[greaterNumber++] = a[i];
            }
    // System.out.println(greater);
    System.out.println(greaterNumber);
    return  greaterNumber;
    }
}
