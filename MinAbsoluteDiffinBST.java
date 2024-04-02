//Problem Link: https://rb.gy/e998r7

//code

class Solution
{
    int mindiff = Integer.MAX_VALUE;
    
    Integer prev = null;
    int absolute_diff(Node root)
    {
        if(root == null) return mindiff;
        
        absolute_diff(root.left);
        
        if(prev != null) {
            mindiff = Math.min(mindiff,Math.abs(root.data-prev));
        }
        
        if(root != null) {
            prev = root.data;
        }
        
        absolute_diff(root.right);
        
        return mindiff;
    }
}
