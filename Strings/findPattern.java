public class findPattern {
    public static void main(String[] agrs) {
        String str = "AAABBBCCCDDDEEE";
        String pattern = "BBBCCC";
        int flag = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (sub.equals(pattern)) {
                    System.out.println(i);
                    flag = 1;
                    break;

                }

            }
        }

        if (flag == 0) {
            System.out.println("not found");
        }

    }

}
