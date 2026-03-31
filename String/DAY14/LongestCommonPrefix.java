import java.util.Arrays;

public class LongestCommonPrefix {

    // Brute Force Approach
    public static String longestCommonPrefix(String[] strs) {
        int count = 0;

        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (String s : strs) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;

    }

    public static String longestCommonPrefix2(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";
        Arrays.sort(strs);

        String start = strs[0];
        String end = strs[strs.length - 1];

        int index = 0;

        while (index < start.length() && index < end.length()) {
            if (start.charAt(index) == end.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return start.substring(0, index);

    }

    public static String longestCommonPrefix3(String[] strs)
    {

        return "";
    }

    public static void main(String[] args) {

        String str[] = { "dog", "racecar", "car" };
        System.err.println(longestCommonPrefix2(str));

    }

}
