
public class MoveZeros {


    //Brute Force Approach
    public static void moveZeros(int nums[]) {

        int n = nums.length;
        int nums2[] = new int[n];
        int index = 0;

        if (n == 1 && nums[n - 1] == 0)
            return;

        for (int i = 0; i < n; i++) {
               if (nums[i] != 0) {
                nums2[index] = nums[i];
                index++;
            }
        }

        for(int i=0; i<n; i++)
        {
            nums[i]=nums2[i];
        }

    }

    // Optimal solution for movezeros

    public static void moveZeros2(int nums[])
    {
        int n=nums.length;
        int j=-1;

        // Finding first zero element in array;
        for(int i=0; i<n; i++)
        {
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }

        if(j==-1) return;

        for(int i=j+1; i<n; i++)
        {
            if(nums[i]!=0)
            {
               int temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
               j++;
            }
        }

    }
    public static void main(String str[]) {


        int arr[] = { 1, 1, 0, 3, 12,5,6,7,8,8,0,0,6,0};
        moveZeros2(arr);
    

    }
}
