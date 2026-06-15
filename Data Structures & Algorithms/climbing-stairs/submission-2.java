class Solution {

    static int[] dp;
    public int climbStairs(int n) {

      dp=new int[n+1];
      Arrays.fill(dp,-1);
      return stairs(n);
        
    }

    private static int stairs(int n){
        if(n<=2) return n;

        if(dp[n] != -1) return dp[n];

        return dp[n]=stairs(n-1)+stairs(n-2);
    }
}
