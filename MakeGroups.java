//Problem Link: https://rb.gy/ifrp1d

//code

public class Solution 
{
	public static int findTwoGroups(int n) 
	{
		int sum = n*(n+1)/2;
		if(sum%2 == 0) return 0;
		return 1;
	}
}

