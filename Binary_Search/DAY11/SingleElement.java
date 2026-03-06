
/*
Problem: Single Element in a Sorted Array

LeetCode Link
https://leetcode.com/problems/single-element-in-a-sorted-array/

Intuition
In this problem every element appears exactly two times except one element that appears only once. The array is sorted.

Because the array is sorted, duplicate elements always stay next to each other. Normally pairs start at even indices.

Example pattern before the single element:
index: 0 1 2 3 4 5
nums : 1 1 2 2 3 3

Pairs follow this pattern:
even index -> first element of pair
odd index  -> second element of pair

After the single element appears, this pattern breaks and shifts.

Example:
1 1 2 3 3 4 4

Here the single element (2) causes the pair structure to shift.

We can use this observation with Binary Search to quickly locate the single element.

Approach

Brute Force Approach
We count how many times each number appears using a HashMap.
Then we return the number whose frequency is 1.

Steps
1. Traverse the array and store frequencies in a HashMap.
2. Traverse the map and return the element with count 1.

Better Approach
Since the array is sorted, we can check neighbors.

Steps
1. If array length is 1, return the first element.
2. Check if the first element is different from the second element.
3. Traverse the array and check:
   nums[i] != nums[i-1] and nums[i] != nums[i+1]
4. That element is the single element.

Optimal Approach (Binary Search)
We use binary search and take advantage of the pair index pattern.

Steps
1. Set low = 0 and high = n - 1.
2. Find mid index.
3. Make mid even if it is odd (mid--).
4. Compare nums[mid] with nums[mid + 1].
5. If they are equal, the single element is on the right side.
6. If they are not equal, the single element is on the left side including mid.
7. Continue until low == high.
8. Return nums[low].

Time Complexity

Brute Force
Time Complexity: O(n)
Space Complexity: O(n)

Better Approach
Time Complexity: O(n)
Space Complexity: O(1)

Optimal Approach (Binary Search)
Time Complexity: O(log n)
Space Complexity: O(1)

Binary Search gives the best performance for this problem.
*/
import java.util.*;
public class SingleElement {

    // Brute force Approach

    public static int singleNonDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value == 1) {
                return key;
            }
        }

        return -1;

    }

    // Better Approach
    public static int singleNonDuplicate2(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[0] != nums[1]) {
                return nums[0];
            }
            if (i + 1 == nums.length) {
                return nums[i];
            }
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return -1;

    }

    // Optimal Approach
    public static int singleNonDuplicate3(int[] nums) {

        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1) {
                mid--;

            }
            if (nums[mid] != nums[mid + 1]) {
                high = mid;

            } else {
                low = mid + 2;

            }
        }

        return nums[low];
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8, 9, };
        System.out.println(singleNonDuplicate3(arr));

    }

}
