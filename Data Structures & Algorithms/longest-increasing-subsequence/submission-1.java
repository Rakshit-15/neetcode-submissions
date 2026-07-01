class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(nums,0,-1,dp);
        
    }

    int solve(int[] nums, int ind, int prev,int[][] dp){

        if(ind == nums.length){
            return 0;  // if I don't have the index then I have noting to count 
                       // so returning 0
        }

        if(dp[ind][prev+1] != -1) return dp[ind][prev+1];

        //not take

        int notTake=0+solve(nums,ind+1,prev,dp);

          int take  = 0;
        if(prev == -1 || nums[ind]>nums[prev]){
          take =1+solve(nums,ind+1,ind,dp);
        }

        return dp[ind][prev+1] = Math.max(take,notTake);
    }
}
