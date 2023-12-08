import java.util.*;

public class findGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int rem = 0;

        while (n % m != 0) {
            rem = n % m;
            m = rem;
            n = m;
        }

        System.out.println(rem);
    }

}
