//Problem Link: https://rb.gy/5p9f6o

//code
class Solution
{
    static Node reverse(Node temp)
    {
        Node pre = null;
        Node cur = temp;
        Node next;
        while(cur != null)
        {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
        
    }
    static Node addTwoLists(Node num1, Node num2)
    {
       
        Node ans = new Node(-1);
        Node h1 = ans;
        num1 = reverse(num1);
        num2 = reverse(num2);
        int sum;
        int carry = 0;
        while(num1 != null || num2 != null || carry != 0)
        {
            sum = carry;
            if(num1 != null)
            {
                sum = sum + num1.data;
                num1 = num1.next;
            }
            if(num2 != null)
            {
                sum = sum + num2.data;
                num2 = num2.next;
            }
            ans.next = new Node(sum%10);
            ans = ans.next;
            carry = sum/10;
        }
        h1 = reverse(h1.next);
        while(h1.data == 0 && h1.next != null)
        {
            h1 = h1.next;
        }
        
        return h1;
        
    }
}
