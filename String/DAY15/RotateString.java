public class RotateString {

    /*
     * Problem Name: Rotate String
     * 
     * Question Link: https://leetcode.com/problems/rotate-string/
     * 
     * Problem Understanding:
     * We are given two strings s and goal. We have to check whether string s can be
     * rotated some number of times so that it becomes equal to goal. In one
     * rotation, the first character of the string moves to the end.
     * 
     * Example:
     * s = abcde
     * goal = cdeab
     * After rotating s two times it becomes equal to goal, so answer is true.
     * 
     * Approach 1: Brute Force using Rotation Simulation
     * Intuition:
     * Simulate all possible rotations of string s. After each rotation, compare the
     * new string with goal. If at any point both strings become equal, return true.
     * 
     * Steps:
     * 
     * 1. Traverse from 0 to length of string s.
     * 2. In each iteration rotate the string by taking substring from index 1 and
     * adding the first character at the end.
     * 3. After each rotation compare the rotated string with goal.
     * 4. If they match return true.
     * 5. If all rotations are checked and no match is found return false.
     * 
     * Time Complexity: O(n^2)
     * Reason: Each rotation takes O(n) time and we perform n rotations.
     * 
     * Space Complexity: O(n)
     * Reason: New string is created during each rotation because strings are
     * immutable.
     * 
     * Approach 2: Optimal using String Concatenation Trick
     * Intuition:
     * If a string s is rotated, then the rotated version will always be a substring
     * of s + s.
     * 
     * Example:
     * s = abcde
     * s + s = abcdeabcde
     * All possible rotations like bcdea, cdeab, deabc etc will be present inside
     * this new string.
     * 
     * Steps:
     * 
     * 1. Check if either string is null.
     * 2. Check if lengths of both strings are equal.
     * 3. Create a new string by concatenating s with itself.
     * 4. Check if goal is a substring of the new string.
     * 5. If yes return true otherwise return false.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     */

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

    // Optimal Solution
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
