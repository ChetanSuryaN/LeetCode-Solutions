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
    public ListNode deleteMiddle(ListNode head) 
    {
        int len=0;
        ListNode fast=head;
        while(fast!=null)
        {
            len++;
            fast=fast.next;
        }
        len/=2;
        int j=0;
        ListNode slow=head;
        if(len==0)
        {
            return null;
        }
        while(slow!=null&&slow.next!=null)
        {
            if(j==len-1)
            {
                slow.next=slow.next.next;
            }
            
                slow=slow.next;
            
            j++;
        }
        return head;

        
    }
}