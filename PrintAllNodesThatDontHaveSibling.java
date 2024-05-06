//Problem Link: https://rb.gy/2q02b2

//code
class Tree
{
    void solve(Node root,ArrayList<Integer> list)
    {
        if(root == null) return ;
        
        if(root.left != null && root.right == null) list.add(root.left.data);
        if(root.right != null && root.left == null) list.add(root.right.data);
        
        solve(root.left,list);
        solve(root.right,list);
        
    }
    
    ArrayList<Integer> noSibling(Node node)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        solve(node,list);
        
        if(list.size() == 0) list.add(-1);
        
        Collections.sort(list);
        
        return list;
        
    }
}
