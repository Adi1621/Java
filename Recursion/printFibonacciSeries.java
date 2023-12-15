import java.util.*;

public class printFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=1; i<=n; i++){
            ans.add(fibo(i));
        }

        System.out.println(ans);
    }

    static int fibo(int n){
       if(n==1 || n==2){
            return 1;
        }

        int ans=fibo(n-1)+fibo(n-2);

        return ans;       
    }

}
