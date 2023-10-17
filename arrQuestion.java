//count the number of elements strictly greater than x
import java.util.*;
public class arrQuestion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements" );
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        int a = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>x){
                a++;
            }
        }
        
        System.out.println(a + " elements are greater than x");

    }
    
    
    
}
