import java.util.HashMap;
import java.util.Map;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        // Brute Force Approach
        int arr[] = new int[2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(++count);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    // Optimal Approach
    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }

        System.out.println(map);
        // for (int i = 0; i < map.size(); i++)
        // {

        // }
        return arr;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 7, 11 };
        int target = 9;
        int result[] = twoSum2(arr, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }

}
