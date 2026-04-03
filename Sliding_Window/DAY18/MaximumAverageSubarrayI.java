/*
LeetCode 643 - Maximum Average Subarray I

Approach 1 (Brute Force):
- Calculate sum of every subarray of size k
- Track maximum average

Time Complexity: O(n * k)
Space Complexity: O(1)

Approach 2 (Sliding Window - Optimal):
- Maintain window of size k
- Add next element and remove left element
- Track maximum average

Time Complexity: O(n)
Space Complexity: O(1)

Link: https://leetcode.com/problems/maximum-average-subarray-i/
*/

public class MaximumAverageSubarrayI {

    // Brute force approach
    public static double findMaxAverage(int[] nums, int k) {

        double maxSum = Double.NEGATIVE_INFINITY;

        for (int i = 0; i <= nums.length - k; i++) {
            double sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }

            maxSum = Math.max(maxSum, sum / k);
        }

        return maxSum;
    }

    // Optimal solution (Sliding Window)
    public static double findMaxAverage2(int[] nums, int k) {

        double maxAverage = Double.NEGATIVE_INFINITY;
        int left = 0;
        int windowSum = 0;

        for (int right = 0; right < nums.length; right++) {

            windowSum += nums[right];

            if (right - left + 1 == k) {

                maxAverage = Math.max(maxAverage, (double) windowSum / k);

                windowSum -= nums[left];
                left++;
            }
        }

        return maxAverage;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;

        System.out.println(findMaxAverage2(arr, k));

        System.out.println(Double.NEGATIVE_INFINITY);
    }
}