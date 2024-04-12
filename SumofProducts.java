//Problem Link: https://rb.gy/h9dhsj

//code
class Solution 
{
    static long pairAndSum(int n, long arr[]) 
    {
        long ans = 0;
        for(int i = 0 ; i < 32 ; i ++)
        {
            long k = 0;
            for(int j = 0 ; j < n ; j ++)
            {
                if((arr[j] & (1 << i)) != 0) k ++;
            }
            k = (1<< i)*( (k)*(k-1)/2 );
            ans += k;
        }
        
        return ans;
    }
}
