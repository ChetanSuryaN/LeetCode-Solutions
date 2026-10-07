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
    public ListNode partition(ListNode head, int x) 
    {
        ListNode head1=new ListNode(-1);
        ListNode head2=new ListNode(-1);        
        ListNode second=new ListNode(0);
        ListNode first=new ListNode(0);
        head1=first;
        head2=second;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val<x)
            {
                ListNode temp=curr.next;
                first.next=curr;
                curr=temp;
                first=first.next;
            }
            else
            {
                ListNode temp=curr.next;
                second.next=curr;
                second=second.next;
                curr=temp;
            }
        }
         second.next=null;
        first.next=head2.next;
       
        

     return head1.next;
        
    }
}