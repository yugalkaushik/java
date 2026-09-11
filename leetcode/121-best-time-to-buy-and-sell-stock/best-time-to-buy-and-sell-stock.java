class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxP = 0;
        int minP = prices[0];
        for(int i=1;i<n;i++){
            minP = Integer.min(minP,prices[i]);
            maxP = Integer.max(maxP,prices[i] - minP);
        }
        return maxP;
    }
}