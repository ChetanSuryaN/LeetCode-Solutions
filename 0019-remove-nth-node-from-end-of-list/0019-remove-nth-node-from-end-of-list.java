/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int i=0;
        ListNode fast=head;
        ListNode current=head;
        while(fast!=null)
        {
            i++;
            fast=fast.next;
          
        }
        if(i==n)
        {
            return head.next;
        }

        
        int j=1;
        while(current!=null&&current.next!=null)
        {
            if(j==i-n)
            {
                current.next=current.next.next;
            }
            else
            {
            current=current.next;
            }
            j++;
            
        }
        return head;

        
    }
}