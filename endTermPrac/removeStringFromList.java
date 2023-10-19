package endTermPrac;

import java.util.*;

public class removeStringFromList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        String str = sc.next();
        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(str) > 0) {
                a.add(arr[i]);
            }
        }

        System.out.println(a);

    }

}
