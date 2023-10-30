import java.util.ArrayList;
import java.util.*;

public class mergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int a[] = new int[m];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> merge = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            merge.add(a[i]);
        }
        
        for (int i = 0; i < b.length; i++) {
            merge.add(b[i]);
        }
        Collections.sort(merge);

        for (int i = 0; i < merge.size() - 1; i++) {
            if (merge.get(i + 1) == merge.get(i)) {
                merge.remove(i);
                i--;
            } else {
                continue;
            }

        }
        System.out.println(merge);

    }
}
