//Problem Link: https://rb.gy/p4qc9y

//code
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        list.add(root.data);
        boolean flag = false;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i = 0 ; i < size ; i ++)
            {
                Node temp = q.poll();
                if(flag == false) 
                {
                    flag = true;
                }
                else list.add(0,temp.data);
                if(temp.right != null) q.add(temp.right);
                if(temp.left != null) q.add(temp.left);
            }
        }
        
        return list;
    }
}
