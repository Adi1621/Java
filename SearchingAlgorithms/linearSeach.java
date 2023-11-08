package SearchingAlgorithms;

public class linearSeach {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 6, 7, 2 };

        int key = 2; // return the index of 2

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                System.out.println(i);
            }

        }
    }

}
