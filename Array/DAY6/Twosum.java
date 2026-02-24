import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {

    // Brute Force Approach
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // optimal approach using HashMap
    public static int[] twoSum2(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++)
        {
            int complement=target-nums[i];
            if(map.containsValue(complement)){
                return  new int[]{map.get(complement),i};
            }
            map.put(i,nums[i]);
        }
        return new int[]{}; // No solution found
    }

    public static void main(String[] args) {

        int arr[] = { 3, 2, 4 };

        int arr2[]=new int[2];

        arr2=twoSum2(arr, 6);

        for(int i:arr2)
        {
            System.out.println(i);
        }




       

    }

}
