class Solution {
     public int rob(int[] nums) {

        
        if(nums.length==1)return nums[0];
      int[] arr1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, nums.length);

        int[] dp1 = new int[arr1.length];
        int[] dp2 = new int[arr2.length];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = solve(arr1, arr1.length - 1, dp1);
        int case2 = solve(arr2, arr2.length - 1, dp2);

        return Math.max(case1, case2);
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
