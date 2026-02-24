
public class MaxConsecutiveOnes {
    /*
Problem: Max Consecutive Ones
Platform: LeetCode

Intuition:
We need to find the longest streak of consecutive 1s in the array.
We scan the array while counting consecutive 1s and reset the count when we encounter 0.

Approach:
1. Initialize res and count to 0.
2. Traverse the array and count consecutive 1s.
3. Reset count when a 0 appears and keep updating res.
4. Return res.

Complexity:
Time: O(n)
Space: O(1)

Link: https://leetcode.com/problems/max-consecutive-ones/
*/
    // Optimized solution
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0; // result variable to store the maximum count of consecutive 1's
        int count = 0; // variable to count the current number of consecutive 1's

        for (int i = 0; i < nums.length; i++) // loop through the input array
        {
            if (nums[i] == 1) // if the current element is 1, increment the count of consecutive 1's
            {
                count++; // increment the count of consecutive 1's
                res = (res > count) ? res : count; // update the result variable if the current count of consecutive 1's
                                                   // is greater than the previous maximum
            } else
                count = 0;// if the current element is not 1, reset the count of consecutive 1's to 0
        }
        return res;// return the maximum count of consecutive 1's found in the input array

    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1};
        int res = findMaxConsecutiveOnes(arr);
        System.out.println(res);

    }
}