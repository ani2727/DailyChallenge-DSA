//Problem Link: http://surl.li/tghvd

//code
class Solution
{
   Node delete(Node head, int k)
    {
        if(k <= 1 || head == null) return null;
        
        Node ans = head;
        int ct = 0;
        while(head != null)
        {
            ct ++;
            
            if(ct%k == 0)
            {
                head.next = head.next.next;
            }
            head = head.next;
        }
        
        return ans;
    }
}
