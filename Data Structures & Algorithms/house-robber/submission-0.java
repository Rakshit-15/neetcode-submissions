class Solution {
    public int rob(int[] nums) {

        int[] dp = new int[nums.length];
        if(nums.length==1)return nums[0];
        Arrays.fill(dp,-1);
       return solve(nums,nums.length-1,dp);
    }

    int solve(int[] nums, int idx,int[] dp){
         if(idx < 0){
            return 0;
         }
         if(idx == 0){
            return nums[0];
         }

        if(dp[idx]!=-1) return dp[idx];

        int notPick = solve(nums,idx-1,dp);
        int pick = nums[idx] + solve(nums,idx-2,dp); 
          
          return dp[idx]=Math.max(pick,notPick);


    }
}
