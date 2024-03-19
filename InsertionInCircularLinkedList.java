//Problem Link: https://rb.gy/97kh3e

//code
public class Solution 
{
    static Node insert(int k, int val, Node head) 
    {
            Node nn = new Node(val);
            if(head == null) 
            {
                nn.next = nn;
                return nn;
            }
            Node temp = head;
            if(k == 0)
            {
                Node first = head;
                nn.next = head;
                
                while(temp.next != first)
                {
                    temp = temp.next;
                }
                temp.next = nn;
                return nn;
            }

            int i = 0;
            while(i+1 < k)
            {
                temp = temp.next;
                i ++;
            }
            nn.next = temp.next;
            temp.next = nn;
            return head;
    }
}
