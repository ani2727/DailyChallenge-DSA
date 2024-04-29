//Problem Link: https://rb.gy/5u4i9v

//code
class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int xor = 0;
        for(int num : nums)
        {
            xor = xor ^ num;
        }    
        int ans = 0;
        for(int i = 0 ; i < 32 ; i ++)
        {
            int xor_bit = xor & (1 << i);
            int k_bit = k & (1 << i);
            if(xor_bit != k_bit) ans ++;
        }

        return ans;
    }
}
