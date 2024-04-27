//Problem Link: http://surl.li/tcmcp

//code

class Solution 
{
    
    static Node merge(Node head1,Node head2)
    {
        Node temp = new Node(-1);
        
        Node head = temp;
        while(head1 != null && head2 != null)
        {
            if(head1.data < head2.data)
            {
                temp.next = head1;
                head1.prev = temp;
                head1 = head1.next;
            }
            else
            {
                temp.next = head2;
                head2.prev = temp;
                head2 = head2.next;
            }
            
            temp = temp.next;
        }
        
        while(head1 != null)
        {
            temp.next = head1;
            head1.prev = temp;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null)
        {
            temp.next = head2;
            head2.prev = temp;
            head2 = head2.next;
            temp = temp.next;
        }
        
        head.next.prev = null;
        return head.next;
    }
    
    
        
    static Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    
    static Node sortDoubly(Node head)
    {
        if(head.next == null) return head;
        
        Node mid1 = findMid(head);
        Node mid2 = mid1.next;
        
        mid1.next = null;
        mid1.prev = null;
        
        Node left = sortDoubly(head);
        Node right = sortDoubly(mid2);
        
        Node ans = merge(left,right);
        
        return ans;
    }

}

