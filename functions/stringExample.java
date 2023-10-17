import java.util.*;

public class stringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String str = sc.nextLine();
        // passing arguments
        String message = greet(str);
        System.out.print(message);
    }

    static String greet(String str) {
        String abc = "hello " + str;
        return abc;

    }

}
