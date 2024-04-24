//Problem Link: https://rb.gy/ptkhai

//code

class Solution
{
    public static int mod = (int)1e9+7;
    public static int solve(int[][] dp,int i,int j)
    {
        if(i == 0 && j == 0) return 1;
        if(i < 0 || j < 0) return 0;
        
        if(dp[i][j] != -1) return (dp[i][j])%mod;
        int left = solve(dp,i-1,j);
        int down = solve(dp,i,j-1);
        
        return dp[i][j] = (left+down)%mod;
    }
    public static int ways(int n, int m)
    {
        int[][] dp = new int[n+1][m+1];
        for(int[] rows : dp) Arrays.fill(rows,-1);
        return solve(dp,n,m);
    }
}
