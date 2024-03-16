//Problem Link: https://leetcode.com/problems/contiguous-array/?envType=daily-question

//code
class Solution 
{
    public int findMaxLength(int[] nums) 
    {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        mp.put(0,-1);
        for(int i = 0 ; i < n ; i ++)
        {
            if(nums[i] == 0) sum -= 1;
            else sum += 1;

            if(mp.containsKey(sum))
            {
                maxLength = Math.max(maxLength,i-mp.get(sum));
            }
            
            else mp.put(sum,i);
        }
        
        return maxLength;
    }
}
