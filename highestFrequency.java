public class highestFrequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };

        int maxCount = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count > maxCount) {
                        maxCount = count;
                        ans = arr[i];
                    }
                }
            }
        }

        System.out.println(ans);
    }

}
