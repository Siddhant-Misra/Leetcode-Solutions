class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;        //keeps track of how much we have made so far and 0 because we havent bought or sold anything
        int min = Integer.MAX_VALUE; //so we dont run into any errors because it has to be smaller than the max value
        //iterate through all the prices
        for(int i = 0; i < prices.length; i++) {
            //at any prices current price can be smaller than the current value then update minimum value
            if(prices[i] < min) {
                min = prices[i];
            }
            //if we have not encountered the smallest value that we have seen 
            //then we calculate the profit would be if we actually sold on that particular day
            else {
                max = Math.max(max, prices[i] - min);
                //we only want to sell if out profit is maximum than any other day
            }
        }
        return max;
    }
}