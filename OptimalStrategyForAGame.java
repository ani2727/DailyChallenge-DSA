//Problem Link: https://rb.gy/m1ilkg

//code
class solve
{
    static long solve(int i,int j,int arr[],long dp[][])
    {
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        
        long i_th = arr[i] + Math.min(solve(i+2,j,arr,dp),solve(i+1,j-1,arr,dp));
        long j_th = arr[j] + Math.min(solve(i+1,j-1,arr,dp),solve(i,j-2,arr,dp));
        
        return dp[i][j] = Math.max(i_th,j_th);
    }
    static long countMaximum(int n, int arr[])
    {
        long dp[][] = new long[n][n];
        for(long row[] : dp) Arrays.fill(row,-1);
        
        return solve(0,n-1,arr,dp);
    }
}
