import java.util.*;

public class toggleAllCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.nextLine());
        for (int i = 0; i < a.length(); i++) {
            // check alphabet small or capital
            boolean flag = true; // true - capital
            char ch = a.charAt(i);
            int asci = (int) ch;
            if (asci >= 97)
                flag = false; // small letter
            if (flag == true) {
                asci += 32;
                char dh = (char) asci;
                a.setCharAt(i, dh);
            } else {
                asci -= 32;
                char dh = (char) asci;
                a.setCharAt(i, dh);
            }

        }
        System.out.println(a);
    }

}
