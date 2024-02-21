public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 9, 11, 23 };
        int target = 7;
        int start = 0;
        int end = arr.length - 1;

        int answer = search(arr, target, start, end);

        System.out.println(answer);

    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // base case
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid; // base case
        }

        if (arr[mid] < target) {
            return search(arr, target, mid + 1, end);
        }

        return search(arr, target, start, mid - 1);
    }

}
