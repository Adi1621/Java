package endTermPrac;

import java.util.*;

public class productiveCharPair {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = i + 1;
        
        while (i < str.length() && j < str.length()) {
            if (str.charAt(i) > str.charAt(j)) {
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(j));
            }
            i = i + 2;
            j = i + 1;
        }

        if (str.length() % 2 != 0) {
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }

}
