package endTermPrac;

import java.util.*;

public class aliceAndBob {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int[] brr = new int[n];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] * 2 < brr[i] || brr[i] * 2 < arr[i]) {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);

    }

}
