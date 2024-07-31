class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int max = 0;

        while(r < prices.length) {
            if(prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            } else {
                // if value at r is lesser than the value at l
                // then move l pointer to the position of r
                l = r;
            }
            r++;
        }

        return max;
    }
}