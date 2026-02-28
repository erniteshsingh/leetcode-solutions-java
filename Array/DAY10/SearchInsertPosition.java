/*
Search Insert Position — Binary Search
Link: https://leetcode.com/problems/search-insert-position/

Intuition:
We need to find the index of the target in a sorted array.
If the target is not present, return the index where it
should be inserted to maintain sorted order.

Binary search efficiently narrows the search space.
When the loop ends, 'low' points to the correct insert position.

--------------------------------------------------------

Approach:
1. Initialize two pointers:
   - low = 0
   - high = n - 1
2. While low <= high:
   - Compute mid safely to avoid overflow.
   - If nums[mid] == target → return mid.
   - If nums[mid] > target → move left.
   - Else → move right.
3. If target not found:
   - low is the correct insertion index.
   - Return low.

Time Complexity:
O(log n) — search space halves each iteration.
Space Complexity:
O(1) — constant extra space.



Edge Cases Handled:
- Target smaller than all elements → returns 0
- Target larger than all elements → returns n
- Target present → returns exact index
- Works for single-element array

*/

class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] > target)
                high = mid - 1;

            else
                low = mid + 1;
        }

        // low is the correct insertion position
        return low;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 6 };
        int target = 2;

        SearchInsertPosition obj = new SearchInsertPosition();
        System.out.println(obj.searchInsert(arr, target));
    }
}