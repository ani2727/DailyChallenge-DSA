//Problem Link: https://rb.gy/hqgrsn

//code
//Approach:1(Better)
-------------------->
  
class Solution
{
    public static long sumSubstrings(String s)
    {
        int n = s.length();
        long mod = (int)1e9+7;
        
        long dp[] = new long[n];
        dp[0] = Integer.parseInt(String.valueOf(s.charAt(0)));
        long ans = 0;
        ans = dp[0];
        for(int i = 1 ; i < n ; i ++)
        {
            long curr = Integer.parseInt(String.valueOf(s.charAt(i)));
            long prev = dp[i-1];
            
            dp[i] = (curr*(i+1) + prev*10)%mod;
            ans = (ans+dp[i])%mod;
        }
        
        return ans;
    }
}

//Approach:2(Optimal)
--------------------->
class Solution
{
    public static long sumSubstrings(String s)
    {
        int n = s.length();
        long mod = (int)1e9+7;
        
        long prev = 0;
        long ans = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            long curr = Integer.parseInt(String.valueOf(s.charAt(i)));
            curr = curr*(i+1);
            
            prev = (curr+prev*10)%mod;
            ans = (ans + prev)%mod;
        }
        
        return ans;
    }
}
