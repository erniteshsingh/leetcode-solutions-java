import java.util.HashMap;
import java.util.Map;

class FindeSingleNumer {

    // optimal Approach
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (temp == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return temp;
            }
        }

        return result;

    }
    // optimal Aproach
    public static int singleNumber2(int[] nums) {
        
    int xor=0;
    for(int i=0; i<nums.length; i++)
    {
        xor=xor^nums[i];
    }
    return xor;
    }

    public static void main(String[] str) {
        int arr[] = { 2, 2, 1, 5, 5, 3, 1, 6, 9, 9, 4, 4, 3, 7, 7, -1, -1 };
         int result = singleNumber(arr);
         System.out.println(result);

    }
}