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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode curr=head;
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        dummy.next=head;
        while(curr!=null)
        {
        if(curr.next!=null&&curr.val==curr.next.val)
            {
               while(curr.next!=null&&curr.next.val==curr.val)
            {
                curr=curr.next;
            }
            ans.next=curr.next;
            
            }
            else
            {
                ans=ans.next;            
            
            }
            curr=curr.next;
            
           
        }
        return dummy.next;
        
    }
}