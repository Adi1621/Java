import java.util.*;

public class merge2SortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array 1");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements in sorted order");
        int[] arr = new int[n];
        for (int a = 0; a < n; a++) {
            arr[a] = sc.nextInt();
        }

        System.out.println("Enter size of Array 2");
        int m = sc.nextInt();
        System.out.println("Enter " + m + " elements in sorted order");
        int[] brr = new int[m];
        for (int a = 0; a < m; a++) {
            brr[a] = sc.nextInt();
        }

        int[] ans = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr.length && j < brr.length && k < ans.length) {
            if (arr[i] < brr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            } else {
                ans[k] = brr[j];
                j++;
                k++;
            }
        }

        while (i < arr.length) {
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j < brr.length) {
            ans[k] = brr[j];
            j++;
            k++;
        }

        for (int a = 0; a < ans.length; a++) {
            System.out.print(ans[a] + " ");
        }
    }
}
