import java.util.*;

public class findGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n % m != 0) {
            int rem = n % m;
            n = m;
            m = rem;
        }

        System.out.println(m);
    }

}
