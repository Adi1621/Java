import java.util.*;
public class printNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        print(n);
        
    }

    static void print(int n){ 
        if(n==1){
            System.out.println(1);
            return;  //base case
        }

        System.out.print(n+" ");
        print(n-1);
        
    }
    
}
