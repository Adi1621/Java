import java.util.*;
public class primeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 2; i<=n;i++){
            while(n%i==0){
                n = n / i;
                ans.add(i);

            }
        }

        System.out.println(ans);
    }
    
}
