//check wheather given array is sorted or not
import java.util.*;
public class arrQuestion2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+ n + " elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean check = true;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
            else{
                check = true;
            }

        }
        System.out.println(check);
        
        }


    }

    

