//Problem Link: https://rb.gy/jwz6id

//code
/**********************************************************
    Following is the Binary Tree Node class structure

    class TreeNode<T> {
        public T val;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

***********************************************************/

public class Solution {
    public static boolean anagram(TreeNode<Integer> root1, int n, TreeNode<Integer> root2, int m) 
    {
        if(root1 == null && root2 != null) return false;
        if(root2 == null && root1 != null) return false;

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        q1.add(root1);
        q2.add(root2);
        while(q1.size() > 0 || q2.size() > 0)
        {
            if(q1.size() != q2.size()) return false;
            int size = q1.size();
            for(int i = 0 ; i < size ; i ++)
            {
                TreeNode first = q1.poll();
                TreeNode second = q2.poll();

                list1.add((int)first.val);
                list2.add((int)second.val);
                if(first.left != null) q1.add(first.left);
                if(first.right != null) q1.add(first.right);
                if(second.left != null) q2.add(second.left);
                if(second.right != null) q2.add(second.right);
            }
            Collections.sort(list1);
            Collections.sort(list2);
            
            if(!list1.equals(list2)) return false;
        }
        return true;
    }
}
