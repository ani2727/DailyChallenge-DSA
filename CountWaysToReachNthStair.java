//Problem Link: https://rb.gy/v8dkxs

//code

class Solution 
{
    Long countWays(int n) 
    {
        if(n == 1) return 1L;
        
        long ans = 1;
        
        for(int i = 2 ; i <= n ; i ++)
        {
            if(i%2 == 0) ans ++;
        }
        
        return ans;
    }
}
