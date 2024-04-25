//Problem Link: https://rb.gy/cwqkdk

//code
class Solution 
{
    public int longestIdealString(String s, int k) 
    {
        int n = s.length();
        int max_length = 1;
        int hash[] = new int[26];
        Arrays.fill(hash,0);
        hash[s.charAt(n-1)-'a'] = 1;

        for(int i = n-2 ; i >= 0 ; i --)
        {
            int lb = Math.max(0,(s.charAt(i)-'a')-k);
            int ub = Math.min(25,(s.charAt(i)-'a')+k);

            int ans = 0;
            for(int j = lb ; j <= ub ; j ++)
            {
                ans = Math.max(hash[j],ans);
            }

            hash[s.charAt(i)-'a'] = Math.max(ans+1,hash[s.charAt(i)-'a']);

            max_length = Math.max(hash[s.charAt(i)-'a'],max_length);
        }  

        return max_length;

    }
}
