import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Approach: Sliding Window + HashMap
Time Complexity: O(n)
Space Complexity: O(k)
Pattern: Fixed Size Window
 */

public class FindAllAnagramsinaString {
    public static List<Integer> findAnagrams(String txt, String pat) {

        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < pat.length(); i++) {
            char ch = pat.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
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
                    list.add(left);
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

        return list;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
