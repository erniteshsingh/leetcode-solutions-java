import java.sql.Time;
import java.util.*;

public class ValidAnagram {
/*
Problem Name: Valid Anagram

Question Link: https://leetcode.com/problems/valid-anagram/

Problem Understanding:
We have to check whether two given strings are anagrams or not.
Two strings are said to be anagrams if they contain the same characters with the same frequency. Order of characters does not matter.

Approach 1: Brute Force using Two HashMaps
Intuition:
Store frequency of each character of both strings in two different hashmaps and then compare both maps.

Steps:

1. First check if lengths of both strings are equal. If not, return false.
2. Traverse both strings and store character frequencies in map1 and map2.
3. Compare frequencies of each character from map1 with map2.
4. If any mismatch is found return false, otherwise return true.

Time Complexity: O(n)
Space Complexity: O(n)

Approach 2: Better using Single HashMap
Intuition:
Use only one hashmap. Increase frequency for characters of first string and decrease frequency for characters of second string. At the end all values should become zero.

Steps:

1. Check length condition.
2. Traverse both strings in one loop.
3. Increase count for s character and decrease count for t character.
4. Finally check all hashmap values. If any value is not zero return false.

Time Complexity: O(n)
Space Complexity: O(n)

Approach 3: Optimal using Frequency Array
Intuition:
Since only lowercase English letters are used, we can replace hashmap with an integer array of size 26. This reduces space complexity.

Steps:

1. Check length condition.
2. Traverse string s and increase count in array.
3. Traverse string t and decrease count in array.
4. If any character count becomes zero before decrement, return false.
5. If loop completes return true.

Time Complexity: O(n)
Space Complexity: O(1)

*/
    // This is a brute force solution
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }

        for (char key : map1.keySet()) {
            if (!map2.containsKey(key) || !map1.get(key).equals(map2.get(key))) {
                return false;
            }
        }

        return true;

    }

    // Better solution
    public static boolean isAnagram2(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0)
                return false;
        }

        return true;
    }

    //Optimal solution
    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            if (count[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            count[t.charAt(i) - 'a'] -= 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram2(s, t));


       

    }

}
