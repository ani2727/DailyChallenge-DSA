//Problem Link: https://rb.gy/5esrje

//code
class Solution 
{
    public int maxDepth(String s) 
    {
        int ct = 0;
        int n = s.length();
        int max_depth = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            if(s.charAt(i) == '(')
                ct ++;
            else if(s.charAt(i) == ')') ct --;

            max_depth = Math.max(ct,max_depth);
        }    
        return max_depth;

    }
}
