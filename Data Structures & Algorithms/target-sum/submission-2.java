class Solution {
    public int findTargetSumWays(int[] nums, int target) {

         int n = nums.length;
         int totalSum=0;

         for(int i : nums){ 
             totalSum += i;
         }
           if((totalSum-target)% 2 != 0 || totalSum-target < 0) return 0;
         int newTarget=(totalSum-target)/2;  // s1-s2=D , count partitions,;ec-18 Striver's

        
        int[][] dp = new int[n][newTarget+1];

        for(int i =0;i < n; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(nums,dp,newTarget,n-1);
    }

    int solve(int[] nums, int[][] dp, int target, int ind){

       if(ind == 0){
    if(target == 0 && nums[0] == 0) return 2;
    if(target == 0 || target == nums[0]) return 1;
    return 0;
}

        if(dp[ind][target]!=-1) return dp[ind][target];

        //notTake

        int notTake = solve(nums,dp,target,ind-1);
        int take=0;
        if(target >=nums[ind]){
            take= solve(nums,dp,target-nums[ind],ind-1);
        }
        return dp[ind][target]=take+notTake;
    }
}
