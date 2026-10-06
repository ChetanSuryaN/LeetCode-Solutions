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
    public ListNode[] splitListToParts(ListNode head, int k)
    {
        ListNode[] ans=new ListNode[k];
        int size=0;
        ListNode curr=head;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        int number=size/k;
        int rem=size%k;
         curr=head;
        
        for(int i=0;i<k;i++)
        {
            ans[i]=curr;
             int r=(rem>0)?1:0;
             rem--;
            for(int j=0;j<number+r-1;j++)
            {
                
               if(curr!=null) curr=curr.next;
            }
             if (curr!=null) 
             {
               ListNode dummy=curr.next;
            curr.next=null;
            curr=dummy;
             }
        }
        return ans;
       
        
    }
}