//Problem Link: https://rb.gy/9yrubr

//code
class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int ct = 0;
        boolean flag = false;
        for(int i = s.length()-1 ; i >= 0 ; i --)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                ct ++;
                flag = true;
            }
            else if(flag) break;
        }
        return ct;
    }
}
