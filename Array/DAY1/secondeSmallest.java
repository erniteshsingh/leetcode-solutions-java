public class secondeSmallest {

    public  static  int smallestNumber(int arr[])
    {
        int smallest=Integer.MAX_VALUE;
        int n=arr.length;

        for(int i=1;i<n; i++)
        {
            if(arr[i]<smallest)
                smallest=arr[i];
        }
        // if Array contain duplicate Value you have check one odition
        if(smallest==Integer.MAX_VALUE)
            return  -1;
        return smallest;

    }

    // let's find out Second Smallest number
    public static  int secondSmallest(int arr[])
    {
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=1; i<n; i++)
        {
            if(arr[i]<smallest) {
                ssmallest = smallest;
                smallest =arr[i];
            }
            else if (arr[i]>smallest && arr[i]<ssmallest)
            {
                ssmallest=arr[i];
            }
        }
        // If Array contain duplicate value
        if(ssmallest==Integer.MAX_VALUE)
            return  -1;
        return  ssmallest;
    }
    public static void main(String[] args) {

        int arr[]={1,2,5,4,3,-1,-2,-5,10};

//        int result=smallestNumber(arr);
        int result=secondSmallest(arr);
        System.out.println("Smallest Number is:"+result);
    }
}
