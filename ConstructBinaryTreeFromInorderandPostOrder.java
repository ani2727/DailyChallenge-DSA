//Problem Link: http://surl.li/tlczy

//code
class GfG 
{
    Node buildTree(int inorder[], int post[], int n) 
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(post[i]);

        Node root = buildTreeHelper(inorder, post, 0, n - 1, 0, n - 1, list);
        return root;
    }

    Node buildTreeHelper(int inorder[], int post[], int inStart, int inEnd, int postStart, int postEnd, List<Integer> list) 
    {
        if (inStart > inEnd || postStart > postEnd)
                return null;

        Node root = new Node(post[postEnd]);

        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) 
        {
            if (inorder[i] == post[postEnd]) 
            {
                inIndex = i;
                break;
            }
        }

        root.right = buildTreeHelper(inorder, post, inIndex + 1, inEnd, postStart + inIndex - inStart, postEnd - 1, list);
        root.left = buildTreeHelper(inorder, post, inStart, inIndex - 1, postStart, postStart + inIndex - inStart - 1, list);

        return root;
    }
}

