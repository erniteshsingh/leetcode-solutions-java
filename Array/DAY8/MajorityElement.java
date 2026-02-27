import java.util.*;

public class MajorityElement {
    /*
     * # Intuition:
     * Given an array of size n, the majority element is the element
     * that appears more than ⌊n/2⌋ times.
     * 
     * # Approach:
     * 
     * Method 1 (Brute Force):
     * - For each element, count its frequency by scanning the array.
     * - If frequency becomes greater than n/2, return that element.
     * - Time-consuming due to nested loops.
     * 
     * Method 2 (HashMap - Better):
     * - Store frequency of each element using a HashMap.
     * - Traverse the map and return the element whose count > n/2.
     * 
     * Method 3 (Optimal - Boyer–Moore Voting) [To be implemented]:
     * - Maintain a candidate and a count.
     * - Same elements increase count; different elements decrease count.
     * - Majority element survives due to frequency > n/2.
     * 
     * # Complexity:
     * 
     * Brute Force:
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     * 
     * Better (HashMap):
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * Optimal (Voting Algorithm):
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * # Problem Link:
     * https://leetcode.com/problems/majority-element/
     */

    public static int majorityElement1(int nums[]) {
        int n = nums.length / 2;
        int count = 1;
        int majorityEle = -1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i])
                    count++;

            }
            if (count > n)
                return nums[i];
        }

        return majorityEle;
    }

    // better Approach
    public static int majorityElement2(int nums[]) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;

        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        for (int key : map.keySet()) {

            if (map.get(key) > n)
                return key;

        }
        return 0;
    }

    public static int majorityElement3(int nums[]) {

        return 0;
    }

    public static void main(String[] str) {

        int arr[] = { 2, 2, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3 };

        int ans = majorityElement1(arr);

        System.out.println(ans);

    }

}
