package leetcode;

import java.util.Arrays;

public class A121BestTimeBuySell {

    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        Arrays.stream(prices).forEach(
                System.out::println
        );
        int min = prices[0];
        int max = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = prices[i];
            }
            if (prices[i] > max) {
                max = prices[i];
            }
            if (max - min > maximumProfit) {
                maximumProfit = max - min;
            }

        }

        return maximumProfit;
    }
}
