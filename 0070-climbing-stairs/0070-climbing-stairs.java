class Solution {
    public int stairs_memo(int n, int[] dp){
        if(n == 0 || n == 1) return 1;
        
        if(dp[n] != -1) return dp[n];

        return dp[n] = stairs_memo(n-1, dp) + stairs_memo(n-2, dp);
    }
    private int stairs_tabu(int n, int[] dp){
        dp[0] = dp[1] = 1;
        for(int i =2; i <= n; i++){
            dp[i] = dp[i-1]  + dp[i-2];
        }
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        // return stairs_memo(n, dp);
        return stairs_tabu(n, dp);
    }
}