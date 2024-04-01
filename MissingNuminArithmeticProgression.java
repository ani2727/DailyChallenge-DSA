//Problem Link: https://rb.gy/w10rby

//code
public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
            int diff1 = arr[1] - arr[0];
            int diff2 = arr[n-1] - arr[n-2];
            int min = Math.min(diff1,diff2);

            if(arr[1]- arr[0] != min) return arr[0]+min;

            for(int i = 2 ; i < n ; i ++)
            {
                if(arr[i]-arr[i-1] != min) return arr[i-1]+min;
            }
            return -1;
    }
}

