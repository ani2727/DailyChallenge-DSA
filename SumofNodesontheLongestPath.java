//Problem Link: https://rb.gy/e2us27

//code
class Solution
{
    int maxlevel = -1;
    int maxsum = 0;
    public int solve(Node root,int level,int sum)
    {
        if(root == null) return 0;
        
        sum += root.data;
        int l = solve(root.left,level+1,sum);
        int r = solve(root.right,level+1,sum);
        
        if(level > maxlevel)
        {
            maxsum = sum;
            maxlevel = level;
        }
        else if(level == maxlevel)
        {
            maxsum = Math.max(sum,maxsum);
        }
        
        return level;
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.data;
        int level = 0,sum = 0;
        solve(root,level,sum);
        return maxsum;
    }
}
