//find 2nd largest number index
import java.util.*;
public class arrQuestion6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for(int i = 0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        

        int[] brr = new int[n];
        for(int i = 0; i<arr.length;i++){
             brr[i] = arr[i];
        }
        
        Arrays.sort(brr);
        int m = brr[n-2];
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == m){
                System.out.println(i);
                break;

            }

        }


    }
}