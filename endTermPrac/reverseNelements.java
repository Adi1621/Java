package endTermPrac;
import java.util.*;
public class reverseNelements {
    public static void main (String[] args) {

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int k = sc.nextInt();

        while(size>0)
        {
            arr.add(sc.nextInt());
            size--;
        }

        for(int i = 0 ; i<arr.size() ; i+=k)
        {
            int left = i;
            int right = Math.min(i+k , arr.size());

            right = Math.min(right,arr.size());
            List<Integer> subList = new  ArrayList<>(arr.subList(left,right));
            Collections.reverse(subList);

            for(int j = left ; j<right ; j++)
            {
                 arr.set(j, subList.get(j - left)); 
            }
        }

        for(int num:arr)
        {
            System.out.print(num+" ");
        }


    }
}