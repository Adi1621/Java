
//find smallest and largest element in array
import java.util.*;

public class arrQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);

        System.out.println("Smallest element is " + arr[0] + " and Largest element is " + arr[n - 1]);

    }

}
