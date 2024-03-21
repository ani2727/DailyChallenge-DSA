//Problem Link: https://rb.gy/dnwj4y

//code

class GFG
{
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	     ArrayList<Integer> res = new ArrayList<Integer>(0);
	     
        if (root == null) 
        return res;
     
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
     
        currentLevel.push(root);
        boolean leftToRight = true;
    
        while (!currentLevel.isEmpty()) 
        {
            Node temp = currentLevel.pop();
            
            if(temp!=null)
            {
                res.add(temp.data);
                
                if (leftToRight)
                {
                    if (temp.left!= null) {
                    nextLevel.push(temp.left);
                    }
                     
                    if (temp.right!= null) {
                    nextLevel.push(temp.right);
                    }
                }
                else 
                {
                    if (temp.right!= null) {
                    nextLevel.push(temp.right);
                    }
                     
                    if (temp.left!= null) {
                    nextLevel.push(temp.left);
                    }
                }
            }
            if (currentLevel.isEmpty()) 
            {
                leftToRight = !leftToRight;
                Stack<Node> temp1 = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp1;
            }
        }
        return res; 
	}
}
