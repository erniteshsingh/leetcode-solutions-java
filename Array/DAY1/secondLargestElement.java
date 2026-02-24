import java.util.Arrays;
import java.util.List;

public class secondLargestElement{
//        Brut Force Approach
        public static int findSecondLargest(int[] nums)
        {
            Arrays.sort(nums);
            int n=nums.length;
           int  maxEle=nums[n-1];
           int secondmax=0;
            for(int i=n-2; i>0; i--)
            {
                if(nums[i]!=maxEle) {
                    secondmax = nums[i];
                    break;
                }
            }
            return secondmax;
        }
    // Better Approach
    public static int findSecondLargest2(int[] nums)
    {
        int maxEle=nums[0];
        int secondmaxEle=Integer.MIN_VALUE;
        //Iterate Each and Every Element of Array to find max Element
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]>maxEle)
                maxEle=nums[i];
        }
        //Again using for loop to find seconde Largest element
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<maxEle && nums[i]>secondmaxEle)
                secondmaxEle=nums[i];
        }
        return  secondmaxEle;

    }
    //Optimal Approach
    public static int findSecondLargest3(int[] nums) {
        int firstLargest = nums[0];
        int secondelargest = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > firstLargest) {
                secondelargest = firstLargest;
                firstLargest = nums[i];
            } else if (nums[i] < firstLargest && nums[i] > secondelargest) {
                secondelargest = nums[i];
            }
        }
        return secondelargest;
    }
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5,5,6,3,2,190,80,-45,9,100};
        //int result = findSecondLargest(nums);
        // int result=findSecondLargest2(nums);
        int result=findSecondLargest3(nums);
        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + result);
        }
    }
    
}