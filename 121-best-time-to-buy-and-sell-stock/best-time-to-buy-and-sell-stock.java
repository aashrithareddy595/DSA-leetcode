class Solution {
    public int maxProfit(int[] prices) {
        // int max = 0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int profit = prices[j] - prices[i];
        //         if(profit>max){
        //             max = profit;
        //         }
        //     }
        // }
        // return max;

        int minprofit = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price : prices){
            if(price < minprofit){
                minprofit = price;
            }
            else{
                maxprofit = Math.max(maxprofit, price - minprofit);
            }
        }
        return maxprofit;
    }
}