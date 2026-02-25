import java.util.*;

public class SingleNumber {
    /*
     * # Intuition:
     * Given an array where every element appears twice except one,
     * we need to find the element that appears only once.
     * 
     * # Approach:
     * 
     * Method 1 (HashMap - Better):
     * - Store frequency of each element in a map.
     * - Traverse the map and return the key whose frequency is 1.
     * 
     * Method 2 (XOR - Optimal):
     * - XOR of same numbers becomes 0.
     * - XOR of any number with 0 remains the number.
     * - So, XOR all elements — duplicates cancel out,
     * and the remaining value is the single number.
     * 
     * # Complexity:
     * 
     * Better (HashMap):
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * 
     * Optimal (XOR):
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     * # Problem Link:
     * https://leetcode.com/problems/single-number/description/
     */
    // Better Approach
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }
        return -1;
    }

    // optimal solution
    public int singleNumber2(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans = num ^ ans;
            System.out.println(ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        int[] nums = { 2, 2, 4, 3, 3 };
        int result = solution.singleNumber2(nums);
        System.out.println("The single number is: " + result);

    }

}
