//Problem Link: https://rb.gy/yblll5

//code
class Solution
{
    public static int grayToBinary(int n) 
    {
        String binary = Integer.toBinaryString(n);
        int grey[] = new int[binary.length()];
        
        grey[0] = Character.getNumericValue(binary.charAt(0));
        for(int i = 1 ; i < binary.length() ; i ++)
        {
            int num = Character.getNumericValue(binary.charAt(i));
            
            grey[i] = grey[i-1]^num;
        }
        int pro = 1;
        int ans = 0;
        for(int i = grey.length-1 ; i >= 0 ; i --)
        {
            ans += grey[i]*pro;
            pro *= 2;
        }
        return ans;
    }      
}
