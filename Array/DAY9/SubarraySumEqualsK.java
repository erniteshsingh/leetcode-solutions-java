import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Subarray Sum Equals K
 * Link: https://leetcode.com/problems/subarray-sum-equals-k/
 *
 * 
 * INTUITION:
 * We need to count the number of continuous subarrays whose sum equals k.
 *
 * Using prefix sum:
 * If prefixSum[j] - prefixSum[i] = k,
 * then the subarray (i+1 ... j) has sum k.
 *
 * Rearranged:
 * prefixSum[i] = prefixSum[j] - k
 *
 * So while traversing, we check whether (currentSum - k)
 * has appeared before using a HashMap.
 *
 * 
 * APPROACHES:
 * 
 * 1) Brute Force (O(n^2) time, O(1) space)
 *    - Fix start index
 *    - Expand subarray
 *    - Count when sum == k
 *
 * 2) Optimal: Prefix Sum + HashMap (O(n) time, O(n) space)
 *    - Maintain running sum
 *    - Store frequency of prefix sums
 *    - If (sum - k) exists, add its frequency to answer
 *
 * IMPORTANT:
 * preSum.put(0, 1) handles subarrays starting from index 0
 */

public class SubarraySumEqualsK {

   
    // Brute Force Approach
    // Time: O(n^2), Space: O(1)
    
    public int subarraySum(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum == k) ans++;

            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) ans++;
            }
        }
        return ans;
    }

   
    // Optimal Approach: Prefix Sum + HashMap
    // Time: O(n), Space: O(n)
   
    public int subarraySumOptimal(int[] nums, int k) {
        int sum = 0, ans = 0;
        Map<Integer, Integer> preSum = new HashMap<>();

        // VERY IMPORTANT: handles subarrays starting at index 0
        preSum.put(0, 1);

        for (int num : nums) {
            sum += num;

            // Check if there exists a prefix with sum = (currentSum - k)
            ans += preSum.getOrDefault(sum - k, 0);

            // Store current prefix sum frequency
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return ans;
    }

    
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;

        SubarraySumEqualsK s = new SubarraySumEqualsK();

        System.out.println("Brute Force Answer: " + s.subarraySum(arr, k));
        System.out.println("Optimal Answer: " + s.subarraySumOptimal(arr, k));
    }
}
