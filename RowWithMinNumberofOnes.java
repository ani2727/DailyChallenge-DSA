//Problem Link: https://rb.gy/f6rs50

//code

class Solution 
{
    int minRow(int n, int m, int a[][]) 
    {
        int count = m;
        int res = 0;
        for(int i=0; i<n; i++){
            int c = 0;
            for(int b : a[i]){
                c += b;
            }
            if(c < count){
                count = c;
                res = i;
            }
        }
        return res+1;
    }
};
