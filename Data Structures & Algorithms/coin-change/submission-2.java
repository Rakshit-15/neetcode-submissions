class Solution {
    public int coinChange(int[] coins, int amount) {

        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(n - 1, coins, amount, dp);

        return ans >= (int)1e9 ? -1 : ans;
    }

    int solve(int ind, int[] coins, int amount, int[][] dp) {

        int INF = (int)1e9;

        if (ind == 0) {
            if (amount % coins[0] == 0) return amount / coins[0];
            return INF;
        }

        if (dp[ind][amount] != -1) return dp[ind][amount];

        int notTake = solve(ind - 1, coins, amount, dp);

        int take = INF;

        if (amount >= coins[ind]) {
            take = 1 + solve(ind, coins, amount - coins[ind], dp);
        }

        return dp[ind][amount] = Math.min(take, notTake);
    }
}