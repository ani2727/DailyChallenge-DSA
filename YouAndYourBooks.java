//Problem Link: https://rb.gy/jqjgu0

//code

class Solution {
    long max_Books(int arr[], int n, int k) 
    {
        long maxi = 0;
        long sum = 0;
        for(int i = 0 ; i < n ; i ++)
        {
            if(arr[i] <= k) sum += arr[i];
            else
            {
                maxi = Math.max(sum,maxi);
                sum = 0;
            }
        }
        maxi = Math.max(sum,maxi);
        return maxi;
    }
}
