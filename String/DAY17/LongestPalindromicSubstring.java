/*
LeetCode: Longest Palindromic Substring
Link: https://leetcode.com/problems/longest-palindromic-substring/

Intuition:
A palindrome expands from its center.
For each character, treat it as a center and expand left and right to find the longest palindrome.
Check for both odd length (center at one char) and even length (center between two chars).

Approach:

1. Traverse each index as center
2. Expand around center for odd and even cases
3. Track longest palindrome using start and end pointers
4. Return substring

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

public class LongestPalindromicSubstring {

public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1)
        return "";

    int start = 0, end = 0;

    for (int i = 0; i < s.length(); i++) {

        int len1 = expandFromCenter(s, i, i); // odd length
        int len2 = expandFromCenter(s, i, i + 1); // even length

        int len = Math.max(len1, len2);

        if (len > end - start) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
        }
    }

    return s.substring(start, end + 1);
}

private static int expandFromCenter(String s, int left, int right) {

    while (left >= 0 && right < s.length() &&
            s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
    }

    return right - left - 1;
}

public static void main(String[] args) {
    String s = "babad";
    System.out.println(longestPalindrome(s));
}

}
