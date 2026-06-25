class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int n= text1.length();
        int m= text2.length();

        int[][] dp = new int[n][m];

        for(int i = 0; i < n ; i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(text1,text2,n-1,m-1,dp);

        
    }
    int solve(String s1, String s2, int ind1, int ind2, int[][] dp){

           if(ind1 < 0 ||  ind2 < 0) return 0;

           if(dp[ind1][ind2]!=-1)return dp[ind1][ind2];
          int match =0;
        if(s1.charAt(ind1) == s2.charAt(ind2)){
            match = 1+solve(s1,s2,ind1-1,ind2-1,dp);
        }
           //if not matched
           int notMatch= Math.max(solve(s1,s2,ind1-1,ind2,dp),solve(s1,s2,ind1,ind2-1,dp));

      return dp[ind1][ind2]=Math.max(match,notMatch);
    }
}
