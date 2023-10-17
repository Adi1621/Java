
//two sum
import java.util.*;

public class practiceQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());

        }
        int k = sc.nextInt();
        int ans1 = sc.nextInt();
        int ans2 = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a.get(i) + a.get(j) == k) {
                    ans1 = a.get(i);
                    ans2 = a.get(j);
                }

            }
        }
        System.out.println(ans1 + ans2);

    }

}
