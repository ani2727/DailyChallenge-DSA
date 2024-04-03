//Problem Link: https://rb.gy/ix59wq

//code

class Solution 
{
    public int kthCommonAncestor(Node root, int k, int x, int y) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        while(root != null)
        {
            al.add(root.data);
            if(x < root.data && y < root.data)
            root = root.left;
            else if(x > root.data && y > root.data)
            root = root.right;
            else 
            break;
        }
        if(k > al.size()) 
        {
            return -1;
        }
        else
        {
            return al.get(al.size() - k );
        }
    }
}
