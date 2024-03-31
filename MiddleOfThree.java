//Problem Link: https://rb.gy/9l583m

//code
public class Solution 
{
	public static int middleOfThree(int x, int y, int z) 
	{
		int min = Math.min(x,Math.min(y,z));
		int max = Math.max(x,Math.max(y,z));

		if(x != min && x != max) return x;
		else if(y != min && y != max) return y;
		else return z;
	}
}
