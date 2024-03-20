//Problem Link: https://rb.gy/t4x53t

//code
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] nextGreaterElement(int n, int A[], int m, int B[]) 
    {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j < m ; j ++)
            {
                if(B[j] == A[i])
                {
                    boolean flag = false;
                    for(int k = j +1 ; k < m ; k ++)
                    {
                        if(B[k] > A[i]) 
                        {
                            ans.add(B[k]);
                            flag = true;
                            break;
                        }
                        
                    }

                    if(flag == false) 
                    {
                        ans.add(-1);
                    }
                    break;
                }
            }
        }
        int result[] = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

}
