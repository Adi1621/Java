package SearchingAlgorithms;

import java.util.*;

public class binarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		for (int i = 0; i <= arr.length; i++) {
			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				ans = mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		System.out.println(ans);

	}

}
