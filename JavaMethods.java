import java.util.*;
class sum{
    int add(int a, int b){
        int ans = a + b;
        return ans;
    }
}
public class JavaMethods {
    public static void main(String[] args){
        sum obj = new sum();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of input numbers is");
        int ans = obj.add(x,y);
        System.out.println(ans);

    }
    
}
