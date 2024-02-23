import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 8, 6, 9, 77, 6 };
        int target = 6;
        int idx = 0;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(search(arr, idx, target, list));
    }

    static ArrayList search(int[] arr, int idx, int target, ArrayList<Integer> list) {
        if (arr[idx] == target) {
            list.add(idx);
        }
        if (idx == arr.length - 1) {
            return list;
        }

        search(arr, idx + 1, target, list);

        return list;

    }
}
