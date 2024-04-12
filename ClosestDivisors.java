//Problem Link: https://rb.gy/1t0xb4

//code
public class Solution 
{
	public static ArrayList<Integer> closestDivisors(int num)
	{
		ArrayList<Integer> list = new ArrayList<>(2);
		list.add(1);
		list.add(num+1);
		int mini = Integer.MAX_VALUE;
		int num1 = num + 1;
		int num2 = num + 2;
		for(int i = 1 ; i <= Math.sqrt(num+2) ; i ++)
		{
			if(num1%i == 0)
			{
				int div = num1/i;
				if(mini > Math.abs(i-div))
				{
					mini = Math.abs(i-div);
					list.set(0,i);
					list.set(1,div);
				}
			}
			if(num2%i == 0)
			{
				int div = num2/i;
				if(mini > Math.abs(i-div))
				{
					mini = Math.abs(i-div);
					list.set(0,i);
					list.set(1,div);
				}
			}
		}
		return list;
	}
}

