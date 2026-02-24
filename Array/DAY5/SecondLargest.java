public class SecondLargest {

    // Better solution
    public static int secondLargestElement(int[] nums) {

        int len = nums.length;

        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;

        int small = Integer.MAX_VALUE, second_Small = Integer.MAX_VALUE;

        if (len == 0 || len == 1) {
            return -1;
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > large)
                large = nums[i];
            if (nums[i] < small)
                small = nums[i];
        }

        for (int j = 0; j < len; j++) {

            if (nums[j] > second_large && nums[j] != large)
                second_large = nums[j];

            if (nums[j] < second_Small && nums[j] != small)
                second_Small = nums[j];
        }

        System.out.println("second_LargestL" + second_large);
        System.out.println("Second_Small:" + second_Small);

        return (second_large != Integer.MIN_VALUE) ? second_large : -1;

    }

    // optimal solution

    public static int secondLargestElement2(int[] nums) {
        int large = Integer.MIN_VALUE;
        int second_larger = Integer.MIN_VALUE;

        int n = nums.length;

        if (n == 0 || n == 1)
            return -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > large) {
                second_larger = large;
                large = nums[i];
            } else if (nums[i] < large && nums[i] > second_larger)
                second_larger = nums[i];
        }
        return (second_larger == Integer.MIN_VALUE) ? -1 : second_larger;
    }

    // optimal solution to find second smallest element in array.

    public static int secondSmallest(int nums[]) {

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        int n = nums.length;

        if (n == 0 || n == 1)
            return -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < small) {
                second_small = small;
                small = nums[i];
            } else if (nums[i] < second_small && nums[i] > small)
                second_small = nums[i];
        }

        return (second_small != Integer.MAX_VALUE) ? second_small : -1;

    }

    public static void main(String[] args) {

        int nums[] = { 5, 10,12,14,14,6 };

        int secondLargets = secondLargestElement2(nums);
        int secondSmallest= secondSmallest(nums);

        System.out.println("Second Largest of Array"+secondLargets);
        System.out.println("Second Smallest Element in Array:"+secondSmallest);
    }

}
