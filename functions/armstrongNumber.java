import java.util.*;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (check(num)) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }

    static boolean check(int num) {
        int copy = num;
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit * lastDigit;
            num = num / 10;
        }

        if (copy != sum) {
            return false;
        }

        return true;
    }

}
