public class countZeros {
    public static void main(String[] args) {
        int n = 1030405000;
        int cnt = 0;

        System.out.println(count(n, cnt));

    }

    static int count(int n, int cnt) {
        if (n == 0) {
            return cnt;
        }

        if (n % 10 == 0) {
            return count(n / 10, cnt + 1);
        }

        else {
            return count(n / 10, cnt);
        }

    }

}
