//Problem Link: https://rb.gy/dhdp8k

//code
class Solution 
{
    public String minRemoveToMakeValid(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        int ct = 0;
        for(int i = 0 ; i < sb.length(); i ++)
        {
            char ch = sb.charAt(i); 
            if(ch == ')') ct --;
            if(ch == '(') ct ++;

            if(ct < 0) 
            {
                sb.deleteCharAt(i);
                ct = 0;
                i --;
            }
        }    
        for(int i = sb.length()-1 ; i >= 0 ; i --)
        {
            if(sb.charAt(i) == '(')
            {
                sb.deleteCharAt(i);
                ct --;
            }
            if(ct == 0) break;
        }

        return sb.toString();
    }
}
