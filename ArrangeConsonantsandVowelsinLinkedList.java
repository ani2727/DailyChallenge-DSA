//Problem Link: https://rb.gy/1kqvja

//code
class Solution {
    
    public Node arrangeCV(Node head)
    {
        Node temp1 = new Node('1');
        Node dummy1 = temp1;
        Node temp2 = new Node('1');
        Node dummy2 = temp2;
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == 'a'||temp.data=='e'||temp.data=='i'||temp.data=='o'||temp.data=='u')
            {
                dummy1.next = temp;
                dummy1 = dummy1.next;
            }
            else 
            {
                dummy2.next = temp;
                dummy2 = dummy2.next;
            }
            temp = temp.next;
        }
        
        dummy1.next = null;
        dummy2.next = null;
        
        dummy1.next = temp2.next;
        
        return temp1.next;
    }
}
