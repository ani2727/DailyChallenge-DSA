//Problem Link: https://rb.gy/xlaq64

//code
class Solution 
{
    public String makeGood(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        while(true)
        {
            boolean flag = false;

            if(sb.length() > 1)
            {
                for(int i = 0 ; i < sb.length()-1 ; i ++)
                {
                    char ch1 = sb.charAt(i);
                    char ch2 = sb.charAt(i+1);

                    if(Character.toLowerCase(ch1) == Character.toLowerCase(ch2))
                    {
                        if((Character.isLowerCase(ch1) && Character.isUpperCase(ch2)) || Character.isUpperCase(ch1) && Character.isLowerCase(ch2)) {
                            sb.deleteCharAt(i);
                            sb.deleteCharAt(i);
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if(flag == false) return sb.toString();
        }
    }
}
