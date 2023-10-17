//find kth smallest and kth largest element
import java.util.*;
public class arrQuestion4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0; i < arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter value of k");
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(k+"th largest element is "+arr[n-k] +" and "+ k +"th smallest element is "+arr[k-1]);

    }
    
}
        