package SearchingAlgorithms;

import java.util.*;

public class linearSeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value of key");
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " is present at " + i + "th " + " index");
            }

        }
    }

}
