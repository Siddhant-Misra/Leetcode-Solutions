class Solution {
    public int maxProfit(int[] prices) {
       if(prices == null || prices.length == 0) {
           return 0;
       } 
       int profit = 0;      //to keep track of our profit
       for(int i =0; i < prices.length -1; i++) {  //going thorugh all of our prices
           if(prices[i + 1] > prices[i]) {          //comparing
               profit += prices[i+1] - prices[i];
           }
       }
       return profit;
    }
}
//this problem boils down to any time we can actually make a profit 
