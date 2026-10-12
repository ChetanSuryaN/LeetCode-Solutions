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
        int i=0;
        ListNode curr=head;
        while(curr!=null)
        {
            i++;
            curr=curr.next;
        }
        
        if(i<2)
        {
            return head;
        }
        k=k%i;
        if(k==0)
        {
            return head;
        }
        
        curr=head;
        for(int j=0;j<i-k-1;j++)
        {
            curr=curr.next;
        }
        ListNode temp=curr.next;
        curr.next=null;
        
        curr=temp;
        while(curr!=null)
        {
            if(curr.next==null)
            {
                curr.next=head;
                break;
            }
            curr=curr.next;
        }

        return temp;        
    }
}