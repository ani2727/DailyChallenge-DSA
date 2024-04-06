//Problem Link: https://rb.gy/90ytbh
//code
public class Solution 
{
	public static String gameOfStones(int num) 
	{
		if(num%2 == 0 || num == 1) return "Ale";
		if(num%2 !=0 && num ==3) return "Bob";
		return "Ale";
	}

}
