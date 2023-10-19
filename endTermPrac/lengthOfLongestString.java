package endTermPrac;

import java.util.*;

public class lengthOfLongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longest = "";

        int maxLen = 0;
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            String sample = words[i];
            int len = sample.length();
            if (len > maxLen) {
                maxLen = len;
                ans = "";
                ans += sample;
            }
        }
        
        System.out.println(maxLen);
        System.out.println(ans);

    }

}
