import java.util.*;
class Arraysort{

    public static boolean arrayisSorted( ArrayList<Integer>nums)
    {
        int n=nums.size();
        for(int i=1; i<n; i++)
        {
            if(nums.get(i)<nums.get(i-1))
             return false;
        }
        return true;
    }

    public static void main(String[] str)
    {
         ArrayList<Integer>list=new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);

         boolean issorted=arrayisSorted(list);
         if(issorted==true)
         System.out.println("Array is sorted");
         else
         System.out.println("Array is not sorted!");
    
    }
}