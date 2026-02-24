import java.util.HashSet;

public class RemveDuplicates {

    // Brute Force Approach!
    public static int removeDuplicates(int[] nums) {

        // This index will moveforward to add unique elements in nums
        int index = 0;

        //Hashed I used to store unique elements we are knowing this
        HashSet<Integer> arr = new HashSet<>(nums.length);

        // Ittrating loop from 0 to n 
        for (int num : nums) {
            // if num does not contain in arr it means that element is unique
            if (!arr.contains(num)) {
                arr.add(num);    //here I am adding elements in arr
                nums[index] = num;  // adding unique elements in nums
                index++;          // increasing index 
            }

        }
        return index; // returning number of unique lements in array
    }

    // Optimal Approach

    public static int removeDuplicates2(int[] nums) {

        int curr = nums[0]; // store first element which is unique
        int j = 0;  // j=0 because I will store next unique elements on j+1 index
        int k = 1;  // why 1 ? because first element of array always will be unique

        for (int i = j + 1; i < nums.length; i++) { // itterating loop from j+1 to n
            if (nums[i] != curr) {  // checking nums[i] !=curr that means that element is unique
                j++;                // why j++ because I am going to store on next index of unique element
                nums[j] = nums[i];  //changing the position of next unique element
                curr = nums[j];     // updating next curr element
                k++;                // counting no of unique elements

            }
        }
        return k;// returning number of unique elements
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 6, 7, 8, 8, 9, 9, 10, 11, 11, 11, 12 };

        int unique = removeDuplicates(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("Number of unique elements:" + unique);

    }
}