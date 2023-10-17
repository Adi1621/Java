//kth element from last
import java.util.*;
public class PracticeQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int k = sc.nextInt();
        System.out.println(a.get(n-k));
    }
    
}
