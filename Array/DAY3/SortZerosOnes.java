class SortZerosOnes{

    //brute Force Approach
     public  static void sortColors(int[] nums)
    {

        int countZeros=0;
        int countOnes=0;
        int countTwos=0;
        int index=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            countZeros++;
            else if(nums[i]==1)
              countOnes++;
            else
            countTwos++;
        }
      
        for(int i=0; i<countZeros; i++)
        {
            nums[index]=0;
            index++;

        }
        for(int i=0; i<countOnes; i++)
        {
           nums[index]=1;
           index++;
        }
        for(int i=0; i<countTwos; i++)
        {
            nums[index]=2;
            index++;
        }

        
    }
    //optimal;
     public  static void sortColors2(int[] nums)
     {
        int countZeros=0;
        int countOnes=0;
        int countTwos=0;
        int index=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            countZeros++;
            else if(nums[i]==1)
              countOnes++;
            else
            countTwos++;
        }

        for(int i=0; i<nums.length; i++)
        {
            if(i<countZeros)
            {
                nums[index]=0;
                index++;
            }
            else if(i<countZeros+countOnes)
            {
                nums[index]=1;
                index++;
            }
            else if(i<countZeros+countOnes+countTwos)
            {
                nums[index]=2;
                index++;
            }
        }

     }


    public static void main(String[] str)
    {

        int arr[]={2,0,2,1,1,0,0,0,0,0,2,2,2,0,0,1,1,2,0,2,1};
        sortColors2(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }


    }
}