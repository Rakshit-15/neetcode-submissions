class Solution {
    public int[] countBits(int n) {
         
         int[] ans = new int[n+1];
        for(int i=0 ; i<=n ; i++){
            int number = i;
            int count = 0;
            while(number!=0){
                number=(number&(number-1));
                count++;
            }
            ans[i] = count;
            
        }
        return ans;
    }
}
