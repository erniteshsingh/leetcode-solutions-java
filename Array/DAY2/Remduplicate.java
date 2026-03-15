import java.util.*;

class Remduplicate{

    // This is a leetcode problem
    // This  is a Brute force solution
    public static int removeDuplicates2(int[] nums)
    {
        int newarray[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            newarray[i]=nums[i];
        } 
        int index=0;
        nums[0]=newarray[0];
        
        for(int i=1; i<newarray.length; i++)
        {

            if(newarray[i]!=nums[index])
            {
                  index++;
                nums[index]=newarray[i];
            }
        }
        return index+1;
    }

    // Optimal Solution
     public static int removeDuplicates3(int[] nums)
     {
        int index=0;
        for(int i=1;  i<nums.length; i++)
        {
            if(nums[i]!=nums[index])
            {
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;      
     }


    public static void main(String[] str)
    {
        //  int arr[]={0,0,1,1,1,2,2,3,3,4};
        int arr[]={1,1,2};

        // int len=removeDuplicates(arr);
        int len=removeDuplicates2(arr);
        for(int i=0; i<len; i++)
        {
            System.out.println(arr[i]);
        }


    }
}