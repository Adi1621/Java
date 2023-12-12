import java.util.*;

public class evenOddSum {
    static boolean check(ArrayList<Integer> a){
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0;i<a.size();i++){
            if(i % 2 == 0){
                evenSum += a.get(i);
            }
            else{
                oddSum += a.get(i);
            }
        }

        if(evenSum != oddSum){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,3,2,3};

        int count=0;

        for(int i=0; i<5; i++){
            int evenSum=0;
            int oddSum=0;
            for(int j=0; j<5; j++){
                if(j!=i){
                    if(j<i){
                        if(j%2==0){
                            evenSum+=arr[j];
                        }
                        else{
                            oddSum+=arr[j];
                        }
                    }
                    else if(j>i){
                        if(j%2!=0){
                            evenSum+=arr[j];
                        }
                        else{
                            oddSum+=arr[j];
                        }
                    }
                }
            }

            if(evenSum==oddSum){
                count++;
            }
        }

        // ArrayList<Integer> a = new ArrayList<>();
        // for(int i = 0;i<arr.length;i++){
        //     a.add(arr[i]);
        // }
        // int count = 0;
        // for(int i = 0;i<a.size();i++){
        //     a.remove(i);
        //     if(check(a) == true){
        //         count ++;
        //     }
        //     a.clear();
        //     for(int j = 0;j<arr.length;j++){
        //     a.add(arr[j]);
        // }

        // }
        System.out.println(count);

    }
    
}
