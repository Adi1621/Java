public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 0, 9, 77, 6 };
        int target = 6;
        int idx = 0;

        System.out.println(search(arr, idx, target));
    }

    static int search(int[] arr, int idx, int target) {
        if (arr[idx] == target) {
            return idx;
        }
        if (idx == arr.length - 1) {
            return -1;
        }

        if (arr[idx] != target) {
            return search(arr, idx + 1, target);
        }

        return -1;

    }
}
