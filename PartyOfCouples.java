//Problem Link: https://rb.gy/ygw5cl

//code

class Solution
{
    static int findSingle(int n, int arr[])
    {
        int xor = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
