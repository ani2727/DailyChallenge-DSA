//Problem Link: https://rb.gy/a5pgq0

//code
class Solution 
{
    public static void solve(Node root,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ans)
    {
        if(root == null) 
        {
            return ;
        }
        
        list.add(root.data);
        
        if(root.left == null && root.right == null) ans.add(new ArrayList<>(list));
        else
        {
            solve(root.left,list,ans);
            solve(root.right,list,ans);
        }
        
        list.remove(list.size()-1);

    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) 
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        solve(root,list,ans);
        
        return ans;
    }
}
