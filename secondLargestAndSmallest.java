import java.util.*;

public class secondLargestAndSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i]);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(list.get(1));
        ans.add(list.get(list.size() - 1));

        System.out.println(ans);

    }
}
