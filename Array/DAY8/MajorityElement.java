import java.util.*;

public class MajorityElement {

    public static int majorityElement1(int nums[]) {
        int n = nums.length / 2;
        int count = 1;
        int majorityEle = -1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i])
                    count++;

            }
            if (count > n)
                return nums[i];
        }

        return majorityEle;
    }

    // better Approach
    public static int majorityElement2(int nums[]) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;

        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        for (int key : map.keySet()) {

            if (map.get(key) > n)
                return key;

        }
        return 0;
    }
    

    public static int majorityElement3(int nums[]) {

        return 0;
    }

    public static void main(String[] str) {

        int arr[] = { 2, 2, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3 };

        int ans = majorityElement1(arr);

        System.out.println(ans);

    }

}
