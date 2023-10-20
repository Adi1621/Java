package endTermPrac;

import java.util.*;

public class balanceParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int i = 0;
        Stack<Character> stack = new Stack<>();

        while (i < str.length()) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '<') {
                stack.push(str.charAt(i));
            }

            else {
                if (stack.isEmpty()) {
                    System.out.println("Not Valid");
                    return;
                } else if (stack.peek() == '(' && str.charAt(i) == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && str.charAt(i) == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && str.charAt(i) == ']') {
                    stack.pop();
                } else if (stack.peek() == '<' && str.charAt(i) == '>') {
                    stack.pop();
                }

            }
            i++;
        }

        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}