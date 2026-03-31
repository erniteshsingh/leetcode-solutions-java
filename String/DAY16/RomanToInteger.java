/*
LeetCode: Roman to Integer
Link: https://leetcode.com/problems/roman-to-integer/

Intuition:
Traverse from right to left.
If current value is smaller than accumulated value → subtract,
otherwise → add.

Approach:

1. Traverse string from right to left
2. Convert Roman character to integer using switch
3. If (4 * num < ans) subtract else add
4. Return result

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class RomanToInteger {
    public static int romanToInt(String s) {

        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;

    }

    public static void main(String[] args) {

        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

}
