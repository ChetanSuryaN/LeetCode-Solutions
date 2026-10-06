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
    public ListNode rotateRight(ListNode head, int k) 
    {
        ListNode curr=head;
        int size=0;
        if(head==null) return null;

        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }
       
        curr=head;
        ListNode dummy=new ListNode();
        k=k%size;
        if(k==0) return head;       
        for(int i=0;i<size-k-1;i++)
        {
            curr=curr.next;
        }
        dummy.next=curr.next;
        curr.next=null;

        ListNode x=dummy.next;
        while(x!=null)
        {
            if(x.next==null)
            {
                x.next=head;
                break;
            }
            x=x.next;
        }
        return dummy.next;
        
    }
}