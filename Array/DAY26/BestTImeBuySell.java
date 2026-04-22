public class BestTImeBuySell {

    public static int maxProfit(int[] prices) {

        int buy = prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > buy) {
                int maxpro = prices[i] - buy;

                if (maxpro > sell) {
                    sell = maxpro;
                }

            } else if (prices[i] < buy) {
                buy = prices[i];
            }

        }
        return sell;

    }

    public static void main(String[] args) {

        int arr[] = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(arr));

    }

}
