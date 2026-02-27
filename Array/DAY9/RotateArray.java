/**
 * Problem: Rotate Array by K steps
 * Link:https://leetcode.com/problems/rotate-array/
 *
 * Simple Idea:
 * We need to rotate the array to the right by k positions.
 * Example:
 * [1,2,3,4,5,6,7], k = 3
 * → [5,6,7,1,2,3,4]
 *
 *
 * APPROACHES:
 * 1) Brute Force
 * - Rotate array one step at a time
 * - Repeat k times
 * - Time: O(n * k)
 * - Space: O(1)
 *
 * 2) Better (Extra Array)
 * - Put each element at its new rotated index
 * - Formula: (i + k) % n
 * - Time: O(n)
 * - Space: O(n)
 *
 * 3) Optimal
 * - (To be implemented later)
 */

class RotateArray {

    // Brute Force Approach.
    public static void rotateArray(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];

            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

    // Better solution
    public static void rotateArray2(int[] nums, int k) {

        int n = nums.length;
        int newNums[] = new int[n];
        k = k % n;

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            newNums[newIndex] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = newNums[i];
        }

    }

    // Optimal Approach (not implemented yet)
    public static void rotateArray3(int[] nums, int k) {

    }

    public static void main(String str[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }, k = 3;

        rotateArray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
