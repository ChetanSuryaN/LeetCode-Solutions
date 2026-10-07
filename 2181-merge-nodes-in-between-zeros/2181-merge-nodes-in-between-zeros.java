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
    public ListNode mergeNodes(ListNode head) 
    {
        ListNode dummy=new ListNode(0);
        ListNode scan=dummy;
        ListNode curr=head;
        int sum=0;
        while(curr!=null)
        {
           
            while(curr.val!=0)
            {
                sum+=curr.val;
                curr=curr.next;
            }
            if(curr.val==0)
            {
                
                
                    
                    scan.next=curr;
                    scan.next.val=sum;
                    
                    scan=scan.next;
               
                
                    sum=0;
                    
                
                
            }
            curr=curr.next;
        }
        scan.next=null;
        return dummy.next.next;
        
    }
}