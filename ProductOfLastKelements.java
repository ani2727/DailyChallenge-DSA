//Problem Link: https://rb.gy/jzn4n7

//code
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] solve(int q, int[][] queries) 
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int row[] : queries)
        {
            if(row[0] == 0) list.add(row[1]);
            else
            {
                int ct = row[1];
                int pro = 1;
                for(int i = list.size()-1 ; i >= 0 ; i --)
                {
                    ct --;
                    pro = pro*list.get(i);
                    if(ct == 0) break;
                }
                ans.add(pro);
            }
        }
        int result[] = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
