
//  Write a Program that takes N elements (max. value of N is 100
// and N is the float number specified by user) from user, stores data
// in an array and Calculates the average of those numbers.
import java.util.*;

public class calculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) sc.nextFloat();
        }
        float sum = 0;
        float average;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        average = sum / n;
        System.out.println(average);

    }

}
