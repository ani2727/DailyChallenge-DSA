//Problem Link:http://surl.li/tkrtz

//code
class Solution 
{
    public int compareVersion(String version1, String version2) 
    {
        int n1 = version1.length(), n2 = version2.length();
        int index = 0;
        int sum1 = 0;
        int sum2 = 0;
        int i = 0, j = 0;
        while(i < n1 || j < n2)
        {
            char ch;
            if(i < n1 && version1.charAt(i) != '.') 
            {
                ch = version1.charAt(i);
                sum1 = sum1*10+ Character.getNumericValue(ch);
                i ++;
            }
            if(j < n2 && version2.charAt(j) != '.')
            {
                ch = version2.charAt(j);
                sum2 = sum2*10+ Character.getNumericValue(ch);
                j ++;
            }

            if((i >= n1 || version1.charAt(i) == '.') && (j >= n2 || version2.charAt(j) == '.'))
            {
                i ++;
                j ++;
                if(sum1 < sum2) return -1;
                else if(sum1 > sum2) return 1;

                sum1 = 0;
                sum2 = 0;
            }
        }
        return 0;
    }
}
