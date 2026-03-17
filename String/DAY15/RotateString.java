public class RotateString {

    // Brute force Approach
    public static boolean rotateString(String s, String goal) {

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            System.out.println(s);

            if (s.equals(goal))
                return true;
        }
        return false;

    }

    //Optimal Solution
    public static boolean rotateString2(String s, String goal) {
        if (s == null || goal == null)
            return false;

        if (s.length() != goal.length())
            return false;

        return (s + s).contains(goal);
    }

    public static void main(String[] args) {

        String s = "abcde", goal = "cdeab";

        System.out.println(rotateString(s, goal));

    }

}
