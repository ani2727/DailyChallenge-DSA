//Problem Link: https://rb.gy/3b2mlw

//code
class Solution 
{
    static Long reversedBits(Long x)
    {
        StringBuilder sb = new StringBuilder();
        Long ans = 0L;
        for(int i = 0 ; i < 32 ; i ++)
        {
            if((x&(1L << i)) != 0) sb.append('1');
            else sb.append('0');
        }
        
        sb.reverse();
        
        for(int i = 0 ; i < sb.length() ; i ++)
        {
            if(sb.charAt(i) == '1') 
            {
                ans += (1L << i);
            }
        }
        
        return ans;
    }
};
