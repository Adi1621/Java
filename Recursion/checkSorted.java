import java.util.*;

public class checkSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // check weather array is sorted or not

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = 0;

        System.out.println(check(arr, idx));

    }

    static boolean check(int[] arr, int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1] && check(arr, idx + 1)) {
            return true;
        }

        return false;

    }

}
