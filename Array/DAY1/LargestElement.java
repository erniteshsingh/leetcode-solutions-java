public class LargestElement{
    //This function will give you largest and smallest element of Array.
    public static  int[] maxandminEle(int[] nums)
    {
        int max=nums[0];
        int min=nums[0];
        int len=nums.length;
        int arr[]=new int[2];
        for(int i=1; i<len; i++)
        {
            if(nums[i]>max)
                max=nums[i];
            else
                min=nums[i];
        }
        arr[0]=max;
        arr[1]=min;
        return  arr;
    }
    // This function will give you largest element of array
    public static int  largestElement(int[] nums)
     {
    int max = nums[0];
    int len = nums.length;

    for (int i = 1; i < len; i++) {
      if (nums[i] > max) max = nums[i];
    }
    return max;
    }
    public static void main(String[] str)
    {
        int[] nums ={8, 8, 7, 6, 5};
        int result=largestElement(nums);
        System.out.println("Largest Element in Array:"+result);
       
    }
}