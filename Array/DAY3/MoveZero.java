class MoveZero {

    // Brute Force Approach.
    public static void moveZeroes(int[] nums) {
        int newArray[] = new int[nums.length];
        int index = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArray[index++] = nums[i];
                
            } else {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            newArray[index++] = 0;
           
        }
        for (int i = 0; i < newArray.length; i++) {
            nums[i] = newArray[i];
        }
    }

    // better Approach
    public static void moveZeroes2(int[] nums) {

        int newArray[] = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArray[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];

        }
    }

    // optimal Approach
    public static void moveZeroes3(int[] nums) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] str) {
        int arr[] = { 0, 1, 0, 3, 1, 4, 54, 3, 3, 2, 12 };
        moveZeroes3(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}