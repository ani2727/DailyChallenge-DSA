//Problem Link: https://rb.gy/zigps3

//code


// User function Template for Java
class Solution 
{
    public int solve(int i, int j, int points[][], int[][] dp) 
    {
        int n = points.length, m = points[0].length;
        
        if(i == n-1 && j == m-1) {
            return Math.max(1,1-points[i][j]);
        }
        if(i >= n || j >= m) return Integer.MAX_VALUE;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int right = solve(i,j+1,points,dp);
        int bottom = solve(i+1,j,points,dp);
        
        int mini = Math.min(right,bottom)-points[i][j];
        
        dp[i][j] = Math.max(1,mini);
        
        return dp[i][j];
    }
    
     public int minPoints(int points[][], int m, int n) 
    {
        int dp[][] = new int[m][n];
        for(int rows[] : dp) Arrays.fill(rows,-1);
        return solve(0,0,points,dp);
    }
}
