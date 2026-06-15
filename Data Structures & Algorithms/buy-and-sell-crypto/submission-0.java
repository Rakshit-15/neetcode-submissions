class Solution {
    public int maxProfit(int[] prices) {

        int l=0,r=1,maxP=0;
        int n = prices.length;

        while(l < r && r < n){
            if(prices[l]<=prices[r]){
                int points = prices[r]-prices[l];
                maxP=Math.max(maxP,points);        
                
            }
            else{
                l=r;
                
            }
            r++;
        
        }
        
        return maxP;
    }
}
