import java.util.Map;
import java.util.HashMap;

/*
# Count Occurrences of Anagrams

Approach: Sliding Window + HashMap
Time Complexity: O(n)
Space Complexity: O(k)
Pattern: Fixed Size Window

 */

public class CountOccurencesofAnagrams {

    public static int search(String pat, String txt) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < pat.length(); i++) {
            char ch = pat.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int ans = 0, left = 0;
        int k = pat.length();
        int count = map.size();
        for (int right = 0; right < txt.length(); right++) {

            char ch = txt.charAt(right);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    count--;
                }
            }

            if (right - left + 1 == k) {

                if (count == 0) {
                    ans++;
                }

                char leftChar = txt.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) == 1) {
                        count++;
                    }
                }

                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String txt = "forxxorfxdofr", pat = "for";
        System.out.println(search(pat, txt));

    }

}
