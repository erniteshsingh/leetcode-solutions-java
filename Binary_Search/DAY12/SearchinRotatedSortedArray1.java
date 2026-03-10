/*
Problem: Search in Rotated Sorted Array

Problem Link
https://leetcode.com/problems/search-in-rotated-sorted-array/

Intuition
The array is sorted but rotated at some pivot. In every step of binary search, one half of the array will always be sorted. By identifying the sorted half and checking if the target lies in that range, we can eliminate half of the search space.

Approach:

1.Brute Force:
Run a for loop through the array and check if any element is equal to the target.
If found return its index, otherwise return -1.

2.Optimal Approach (Binary Search):
1. Initialize low = 0 and high = n - 1.
2. Run loop while low <= high.
3. Find mid index.
4. If nums[mid] == target return mid.
5. Check if left half is sorted (nums[low] <= nums[mid]).
6. If target lies between nums[low] and nums[mid], move high = mid - 1.
7. Otherwise move low = mid + 1.
8. If right half is sorted, check if target lies between nums[mid] and nums[high].
9. Adjust low or high accordingly.

Time Complexity
Brute Force: O(n)
Optimal: O(log n)

Space Complexity
O(1)
 */

public class SearchinRotatedSortedArray1 {

    // Brute Force Approach
    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Optimal Approach
    public static int search2(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {

                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 }, target = 0;

        System.out.println(search2(arr, target));

    }

}
