//Problem Link: https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1

//code
class Solution
{
    void deleteNode(Node del_node)
    {
        Node curr = del_node.next;
        
        del_node.data = curr.data;
        
        del_node.next = curr.next;
    }
}
