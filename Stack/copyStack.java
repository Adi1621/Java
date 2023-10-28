package Stack;
import java.util.*;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n;
        n=sc.nextInt();
        
        for(int i = 1;i<=n;i++){
            int x = sc.nextInt();
            stack.push(x);
        

        }
        System.out.println(stack);

        
    }
    
}
