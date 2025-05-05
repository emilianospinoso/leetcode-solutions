package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class A121BestTimeBuySellTest {

    @Test
    void maxProfit() {
        A121BestTimeBuySell A12 = new A121BestTimeBuySell();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expectedMaxProfit = 5;
        Assertions.assertEquals(expectedMaxProfit, A12.maxProfit(prices));
    }
}