//Problem Link: https://rb.gy/iyazyt

//code
class Solution 
{
   
    public int tribonacci(int n) 
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;

        int t1 = 0,t2 = 1,t3 = 1;
        for(int i = 3 ; i <= n ; i ++)
        {
            int val = t1+t2+t3;
            t1 = t2;
            t2 = t3;
            t3 = val;
        }

        return t3;
    }
}
