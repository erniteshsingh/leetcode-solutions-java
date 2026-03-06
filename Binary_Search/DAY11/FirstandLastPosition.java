public class FirstandLastPosition {

    // Brute Force Approach
    public static int[] searchRange(int[] nums, int target) {

        int startPosition = -1, endPosition = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                startPosition = i;
                break;
            }
        }

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == target) {
                endPosition = i;
                break;
            }
        }
        return new int[] { startPosition, endPosition };
    }

    // Optimal solution


    public static int[] searchRange2(int[] nums, int target) {


        return new int[] {  };
    }

    public static void main(String[] args) {

        int arr[] = { 5, 7, 7, 8, 8, 8,8,8,10 }, target = 8;

        int res[] = new int[2];
        res = searchRange2(arr, target);
        for (int i = 0; i < 2; i++) {
            System.out.print(res[i]);
        }

    }

}