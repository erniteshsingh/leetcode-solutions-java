public class LargestOddNumberInString {

    //Optimal solution.
    public static String largestOddNumber(String num) {

        int len = num.length() - 1;

        for (int i = len; i >= 0; i--) {

            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";

    }

    public static void main(String[] args) {

        String str = "35427";
        System.out.println(largestOddNumber(str));

    }

}
