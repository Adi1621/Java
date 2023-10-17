public class basic {

    public static void main(String[] args) {
        // pass the value of numbers when you are calling the method in main
       //passing arguments
        int a = sum(10, 20);
        System.out.println(a);

    }

    static int sum(int x, int y) {

        int z = x + y;
        return z;
    }
}
