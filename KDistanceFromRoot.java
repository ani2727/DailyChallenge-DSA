//Problem Link: http://surl.li/tkrfs

//code
class Tree
{
    void solve(Node root,int level,int k,ArrayList<Integer> list)
    {
        if(root == null) return ;
        if(level == k) list.add(root.data);
        
        solve(root.left,level+1,k,list);
        solve(root.right,level+1,k,list);
    }
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer> list = new ArrayList<>();
          solve(root,0,k,list);
          
          return list;
     }
}
