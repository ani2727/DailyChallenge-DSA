//Problem Link: https://www.geeksforgeeks.org/problems/level-order-traversal/1

//code
class Solution
{
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        while(q.size() > 0)
        {
            int size = q.size();
            for(int i = 0 ; i < size ; i ++)
            {
                Node temp = q.poll();
                list.add(temp.data);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        
        return list;
    }
}

