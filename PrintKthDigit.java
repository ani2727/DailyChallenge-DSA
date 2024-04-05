//Problem Link: https://rb.gy/arlltl

//code
public class Solution 
{
    public static int findKthFromRight(int n, int m, int k)
    {
        StringBuilder sb = new StringBuilder();
        sb.insert(0,(long)Math.pow(n,m));
        int ct = 0;

        for(int i = sb.length()-1 ; i >= 0 ; i --)
        {
            ct ++;
            if(ct == k) {
                return Character.getNumericValue(sb.charAt(i));
            }
        }
        return 0;
    }
}
