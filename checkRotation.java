import java.util.*;
public class checkRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        
        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}
