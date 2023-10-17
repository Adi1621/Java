//reverse array
import java.util.*;
public class arrQuestion5 {  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int [] arr = new int [n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] +" ");  
        }  
    } {
        
    } 
} 