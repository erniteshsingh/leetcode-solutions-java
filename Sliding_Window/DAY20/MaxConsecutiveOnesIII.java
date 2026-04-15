public class MaxConsecutiveOnesIII {

    public  static int longestOnes(int[] arr, int k) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum == k)
            return arr.length;

        sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k) {
                if (i + 1 > max) {
                    max = i + 1;
                }
                
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { -5, 8, -14, 2, 4, 12 };
        int k=-5;

        System.out.println(longestOnes(arr,k));

    }

}
