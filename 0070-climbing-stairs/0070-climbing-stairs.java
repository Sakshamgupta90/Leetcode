class Solution {
    public int stairs_memo(int n, int[] dp){
        if(n == 0 || n == 1) return 1;
        
        if(dp[n] != -1) return dp[n];

        return dp[n] = stairs_memo(n-1, dp) + stairs_memo(n-2, dp);
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return stairs_memo(n, dp);
    }
}