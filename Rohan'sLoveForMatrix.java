//Problem Link: https://rb.gy/ympxd5

//code
class Solution {
    static int firstElement(int n) 
    {
        int a=1,b=0;
        for(int i=2;i<=n;i++)
        {
            int temp=a;
            a=(a+b)%1000000007;
            b=temp;
        }
        return a%1000000007;
    }
}
