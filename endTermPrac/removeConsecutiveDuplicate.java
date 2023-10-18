package endTermPrac;

import java.util.*;

public class removeConsecutiveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> brr = new ArrayList<>();
        brr.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                brr.add(arr[i]); 
            } else {
                continue;
            }
        }
        System.out.println(brr);

    }

}
