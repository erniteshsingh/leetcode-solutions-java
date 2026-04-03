/*
LeetCode 1456 - Maximum Number of Vowels in a Substring of Given Length

Approach:
- Use Sliding Window (Fixed Window)
- Maintain window size of k
- Count vowels in current window
- Update maximum vowel count

Time Complexity: O(n)
Space Complexity: O(1)

Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
*/

public class Maximum_Number_vowels_Sub {

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {

        int maxCount = 0;
        int currentCount = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (isVowel(ch)) {
                currentCount++;
            }

            if (right - left + 1 == k) {

                maxCount = Math.max(maxCount, currentCount);

                if (isVowel(s.charAt(left))) {
                    currentCount--;
                }

                left++;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s, k));
    }
}