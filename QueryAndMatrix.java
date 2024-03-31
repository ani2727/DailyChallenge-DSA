//Problem Link: https://rb.gy/qfezg4

//code
import java.util.*;

public class Solution 
{
	public static int[] query(int[][] mat, int m, int n, String[] q) 
	{
		List<Integer> ans = new ArrayList<>();
		int k = 0;
		while(k < q.length)
		{

			String s = q[k];
			int index = Character.getNumericValue(s.charAt(2));
			if(s.charAt(0) == '1')
			{
				if(s.charAt(1) == 'R')
				{
					for(int i = 0 ; i < n ; i ++)
					{
						if(mat[index][i] == 0) mat[index][i] =1;
						else mat[index][i] = 0;
					}
				}
				else 
				{
					for(int i = 0 ; i < m ; i ++)
					{
						if(mat[i][index] == 0) mat[i][index] = 1;
						else mat[i][index] = 0;
					}
				}
			}
			else
			{
				int ct = 0;
				if(s.charAt(1) == 'R')
				{
					for(int i = 0 ; i < n ; i ++)
					{
						if(mat[index][i] == 0) ct ++;
					}
					ans.add(ct);
				}
				else
				{
					for(int i = 0 ; i < m ; i ++)
					{
						if(mat[i][index] == 0) ct++;
					}
					ans.add(ct);
				}
			}
			k ++;
		}

		int arr[] = ans.stream().mapToInt(Integer::intValue).toArray();

		return arr;
	}
}
