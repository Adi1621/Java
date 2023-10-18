package endTermPrac;

import java.util.*;

public class removingConsecutiveElementString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Character> a = new ArrayList<>();
        a.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                a.add(str.charAt(i));
            } else {
                continue;
            }
        }
        int i = 0;
        while (i < a.size()) {
            System.out.print(a.get(i));

            i++;
        }
    }

}
