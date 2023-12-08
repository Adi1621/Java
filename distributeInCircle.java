import java.util.*;

public class distributeInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = (a + c - 1) % b;
        if (ans == 0) {
            ans = b;
        }

        System.out.println(ans);
    }

}
