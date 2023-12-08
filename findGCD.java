public class findGCD {
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        int rem = 0;

        while (n % m != 0) {
            rem = n % m;
            m = rem;
            n = m;
        }

        System.out.println(rem);
    }

}
