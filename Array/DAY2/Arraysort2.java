import java.util.Arrays;
class Arraysort2
{

     public static boolean check(int[] nums) 
     {
        int arr[]=new int[nums.length];
        int newArr[]=new int[nums.length];
        boolean sort=true;

        for(int i=0; i<nums.length; i++)
        {
            newArr[i]=nums[i];
        }
        Arrays.sort(nums);

        for (int i=0; i<nums.length-1; i++)
        {

            for(int j=i; j<nums.length; j++)
            {
              
                arr[j]=nums[j];
            }
            for(int k=0; k<newArr.length; k++)
            {
                if(newArr[k]!=arr[k])
                {
                    sort=false;
                    break;
                }

            }
        }
        return sort;     
     }


    public static void main(String[] str)
    {
        // This is a leetcode proble which i am not able to solve but i will try again.
       int nums[] = {3,4,5,1,2};

       boolean ans=check(nums);
       System.out.println(ans);
    


    }
}