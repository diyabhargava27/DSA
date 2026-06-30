class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] max = new int[n];
        int maxValue = 0;
        
        for(int i=n-1;i>=0;i--){
            if(prices[i]>maxValue){
                maxValue = prices[i];
            }
            max[i]=maxValue;
        }
        int ans = 0;
        //max profit
        for(int i=0;i<n;i++){
            if(max[i]-prices[i]>ans){
                ans = max[i]-prices[i];
            }
        }
        return ans;
    }
}