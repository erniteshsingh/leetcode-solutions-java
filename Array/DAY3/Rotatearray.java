
import java.util.*;
 class Rotatearray
{
    //Brute Force Approach
    public static void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        int r=k%n;
        int temp[]=new int[n];
        int index=0;
        for(int i=0; i<r; i++)
        {
            temp[index]=nums[n-r+i];
            index++;
        }
        for(int i=0;i<n-r; i++)
        {
            temp[index]=nums[i];
            index++;
        }
        for(int i=0; i<n; i++)
        {
          nums[i]=temp[i];
        }
    }

    // Better Approach
    // Right Rotation from k places
    /*
      right rotation:
      Reverse whole array
      Reverse first k
      Reverse last n-k
     */
    public static void main(String[] str)
    {
        int k=3;
        int[] arr = {1,2,3,4,5,6,7};
        rotate2(arr,0,arr.length);
        rotate2(arr,0,k);
        rotate2(arr,k,arr.length-k);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        
        
    }
}
