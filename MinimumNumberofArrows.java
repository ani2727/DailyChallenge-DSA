//Problem Link: https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/?envType=daily-question&envId=2024-03-18

//code
class Solution {
    public int findMinArrowShots(int[][] points) 
    {
        int n = points.length;

        Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1]));   
        
        int upper = points[0][1];
        int ct = 1;
        for(int i = 1 ; i < n ; i ++)
        {
            if(points[i][0] > upper) 
            {
                ct ++;
                upper = points[i][1];
            }
        }
        return ct;
    }
}
