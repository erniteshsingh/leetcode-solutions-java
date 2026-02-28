/*
Find Target Indices After Sorting
Link: https://leetcode.com/problems/find-target-indices-after-sorting/

Problem:
Given an integer array and a target value, return the
indices where the target appears in the array after sorting.

Intuition:

Brute Force:
- Sort the array.
- Traverse and collect indices of target.
Optimal Thinking:
- Instead of sorting (O(n log n)), count:
    • how many numbers are smaller than target
    • how many numbers equal target
- In sorted order, targets will occupy a continuous block.
- Starting index = count of smaller elements.

This avoids sorting and achieves linear time.

Approaches:
1️. Brute Force
- Sort + scan
- Simple but slower

2️. Better (two-pass counting)
- Count smaller elements
- Then place indices for equals

3️. Optimal (single counting pass)
- Count both smaller and equal
- Generate indices directly
- Most efficient and clean

Time Complexity:

Brute Force → O(n log n)  
Better → O(n)  
Optimal → O(n)

Space Complexity:
O(1) extra (excluding output list)


Recommendation:
Use Approach 3 for best performance and clean logic.

*/

import java.util.*;

public class TargetIndices {

    // 1. Brute Force Approach — O(n log n)
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                list.add(i);
        }
        return list;
    }

    // 2. Better Approach — O(n)
    public List<Integer> targetIndices2(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target)
                count++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                list.add(count++);
        }
        return list;
    }

    // 3️. Optimal Approach — O(n) (recommended)
    public List<Integer> targetIndices3(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();
        int less = 0;
        int equal = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                less++;
            } else if (nums[i] == target) {
                equal++;
            }
        }

        for (int i = 0; i < equal; i++) {
            list.add(less++);
        }
        return list;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 5, 2, 3 };
        int target = 2;

        TargetIndices obj = new TargetIndices();
        System.out.println(obj.targetIndices3(arr, target));
    }
}