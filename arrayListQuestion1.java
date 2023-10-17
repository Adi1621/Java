//reverse an arraylist
import java.util.*;
public class arrayListQuestion1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size of arraylist");
        
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        
        System.out.println("enter "+ n +" elements");
        // int i=n;
        // while(i>0){
        //     a.add(sc.nextInt());
        //     i--;
        // }
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        System.out.println(a);
        int start=0;
        int end=n-1;
        while(start<=end){
            int temp=a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
        System.out.println(a);

        
        
        


    }
    
}
