//Problem Link: https://rb.gy/usylw2

//code

class Solution {

    int[] Series(int n) 
    {
        int mod = (int)1e9+7;
        
        int prev = 1;
        int second_prev = 0;
        int arr[] = new int[n+1];
        arr[0] = second_prev;
        arr[1] = prev;
        for(int i = 2; i <= n ; i ++)
        {
            arr[i] = (second_prev + prev)%mod;
            second_prev = prev;
            prev = arr[i];

        }
        
        return arr;
    }
}
