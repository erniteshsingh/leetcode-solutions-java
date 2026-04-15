import java.util.Arrays;

public class MaximumPointsCards {

    public static int maxScore(int[] cardPoints, int k) {

        Arrays.sort(cardPoints);

        int len = cardPoints.length;
        k = k - 1;
        int sum = cardPoints[len - 1];
        int left = 0, max = Integer.MIN_VALUE;
        ;

        for (int right = 0; right < len - 1; right++) {

            sum += cardPoints[right];
            if (right - left + 1 == k) {

                if (sum > max) {
                    max = sum;
                }
                sum = sum - cardPoints[left];
                left++;

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 40, 17, 9, 73, 75 }, k = 3;

        System.out.println(maxScore(arr, k));

    }

}
