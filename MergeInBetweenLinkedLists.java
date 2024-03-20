//Problem Link: https://rb.gy/6cj9cc

//code
class Solution {
    public ListNode mergeInBetween(ListNode head, int a, int b, ListNode list2) 
    {
        ListNode temp = head;
        ListNode start = head;
        int ct = 0;
        while(temp != null)
        {
            if(ct == a)
            {
                ListNode prev = temp;
                while(temp != null)
                {
                    if(ct == b)
                    {
                        start.next = list2;
                        break;
                    }
                    temp = temp.next;
                    prev = temp;
                    ct ++;
                }
                
                temp = head;
                while(temp.next != null) temp = temp.next;

                temp.next = prev.next;
                break;
            }
            start = temp;
            temp = temp.next;
            ct ++;
        }
        return head;
    }
}
