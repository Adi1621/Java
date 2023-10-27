import java.util.*;

public class palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Boolean a = false;
        for (int i = 0, j = s.length()-1 ; i < s.length()/2 && j >= s.length()/2; i++, j--) {
            if (s.charAt(i) == s.charAt(j)) {
                a = true;
            } 
            else {
             a = false;
            }
        }
        
        System.out.print(a);
    }

}
