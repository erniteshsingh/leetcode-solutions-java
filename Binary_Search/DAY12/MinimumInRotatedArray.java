/*
Problem: Find Minimum in Rotated Sorted Array

Problem Link
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

Intuition
The array is originally sorted but rotated at some pivot. The minimum element is the point where rotation happened. Using binary search, we can compare the middle element with the rightmost element to decide which half contains the minimum.

Approach

Brute Force
Run a for loop through the entire array and keep updating the minimum element.

Optimal Approach (Binary Search)
1. Initialize low = 0 and high = n - 1.
2. Run loop while low < high.
3. Find mid.
4. If nums[mid] > nums[high], the minimum lies in the right half → low = mid + 1.
5. Otherwise, the minimum lies in the left half or at mid → high = mid.
6. When the loop ends, low points to the minimum element.

Time Complexity
Brute Force: O(n)
Optimal: O(log n)

Space Complexity
O(1)
*/

class MinimumInRotatedArray {
    // Brute Force Approach
    public int findMin(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

        }
        return min;
    }

    // optimal Approach
    public static int findMin2(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[high])
                low = mid + 1;
            else
                high = mid;
        }

        return nums[low];

    }

    public static void main(String[] args) {

        int arr[] = { 3, 4, 5, 1, 2 };
        System.out.println(findMin2(arr));

    }
}
