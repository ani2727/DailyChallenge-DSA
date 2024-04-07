//Problem Link: https://rb.gy/niff8b

//code
public class Solution 
{
	public static int findSetBit(int n) 
	{
		StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));

		int ct = 0;
		int index = 0;
		for(int i = sb.length()-1 ; i >= 0 ; i --)
		{
			if(sb.charAt(i) == '1')
			{
				ct ++;
				index = sb.length()-i;
			}
		}
		if(ct != 1) return -1;
		return index;
	}
}
