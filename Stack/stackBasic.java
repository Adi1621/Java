package Stack;

import java.util.Stack;

public class stackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);
        while(stack.size()>1){
            stack.pop();
        }
        System.out.println(stack);
    }
    
}
