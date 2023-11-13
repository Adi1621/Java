import java.util.*;

public class checkSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                flag = flag + 1;

            } else {
                System.out.println("Not Sorted");
            }
        }
        if (flag == arr.length - 1) {
            System.out.println("Sorted");



        }
    }

}
