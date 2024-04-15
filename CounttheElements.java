//Problem Link: https://rb.gy/e155q2

//code
  class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int res[] = new int[q];
        
        for(int i = 0 ; i < q ; i ++ ) {
            int num = a[query[i]];
            int ct = 0;
            for(int j = 0 ; j < n ; j ++) {
                if(b[j] <= num) {
                    ct ++;
                }
            }
            res[i] = ct;
        }
        
        return res;
    }
}
