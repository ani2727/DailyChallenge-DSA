//Problem Link: http://surl.li/tghvd

//code
class Solution
{
   Node delete(Node head, int k)
    {
        int m = 1;
        Node prev = null;
        Node temp = head;
        if(k <= 1) return null;
        while(temp != null)
        {
            if(m%k == 0)
            {
                prev.next = temp.next;
            }
            
            m ++;
            prev = temp;
            temp = temp.next;
        }
        
        return head;
    }
}
