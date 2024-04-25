//Problem Link: https://rb.gy/gpl8xi

//code
class Solution 
{
    int findMaxSum(int n, int m, int mat[][]) 
    {
        if(n < 3 || m < 3) return -1;
        
        int max_sum = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j < m ; j ++)
            {
                int sum = 0;
                if(i + 2 < n && j+2 < m )
                {
                    sum = sum + mat[i][j] + mat[i][j+1] + mat[i][j+2];
                    sum = sum + mat[i+1][j+1];
                    sum = sum + mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];
                }
                
                max_sum = Math.max(max_sum,sum);
            }
        }
        
        return max_sum;
    }
};
