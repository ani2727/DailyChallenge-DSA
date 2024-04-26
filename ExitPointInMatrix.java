//Problem Link: http://surl.li/szopy

//code
class Solution 
{
    public int[] FindExitPoint(int n, int m, int[][] mat) 
    {
        int dir = 0;//0=east, 1=south, 2 = west, 3 = north
        
        int res[] = new int[2];
        int i = 0,j = 0;
        
        res[0] = i;
        res[1] = j;
        while(true)
        {
            if(i < 0 || j < 0 || i == n || j == m) 
            {
                break; 
            }
            
            
            dir = (dir + mat[i][j]) % 4;
            if(mat[i][j] == 1) mat[i][j] = 0;
            
            if(dir == 0) j ++;
            else if(dir == 1) i ++;
            else if(dir == 2) j --;
            else if(dir == 3) i --;
            
            
        }
        
        res[0] = i < 0 ? 0 : i >= n ? n - 1 : i;
        res[1] = j < 0 ? 0 : j >= m ? m - 1 : j;
        
        return res;
    }
}
