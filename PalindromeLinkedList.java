//Problem Link: https://rb.gy/bde9yr

//code
class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {
        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) 
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode curr = slow;
        ListNode prev = null;
        while(curr != null)
        {
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }  

        while (prev != null) 
        {
            if (prev.val != head.val) return false;

            prev = prev.next;
            head = head.next;
        }

        return true;
    }
}
