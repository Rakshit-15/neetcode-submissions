class Solution {
    public boolean canPartition(int[] nums) {
        
      int n= nums.length;
      int s=0;
      for(int number : nums){
          s+=number;

      }
      int[][] dp = new int[n][s/2+1];
      for(int i =0;i< n;i++){
        Arrays.fill(dp[i],-1);
      }
      if(s%2!=0) return false;

      boolean ans= subsetSumK(n-1, s/2 , nums , dp);
       
       return ans;
    }


    boolean subsetSumK(int ind , int target , int[] nums , int[][] dp){

         if(target == 0) return true;
        if(ind == 0){
         return target == nums[0];
        }
        
        if(dp[ind][target] != -1) return dp[ind][target] == 1;

        boolean notTake = subsetSumK(ind-1,target,nums,dp);

        boolean take = false;
           if(nums[ind] <= target){
        take = subsetSumK(ind-1,target-nums[ind],nums,dp);
        }

         dp[ind][target]=take || notTake ? 1 : 0;
         return take || notTake;

    }
}
