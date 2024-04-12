//Problem link: https://rb.gy/3lsl5d

//code
class Solution 
{
  public static int[] completeSum(int a[], int n) 
  {
      for(int i = 1 ; i < n ; i ++) a[i] = a[i-1]+a[i];
      return a;
  }
}
