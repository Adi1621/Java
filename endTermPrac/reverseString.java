package endTermPrac;

import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] a = str.split(" ");
        ArrayList<String> b = new ArrayList<>(Arrays.asList(a));
        Collections.reverse(b);
        int i = 0;
        while (i < b.size()) {
            System.out.print(b.get(i));
            System.out.print(" ");
            i++;
        }
    }

}
