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
    public ListNode doubleIt(ListNode head) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }
        int carry=0;
        for(int i=list.size()-1;i>=0;i--)
        {
            int mul=2*list.get(i);
            list.set(i,mul%10+carry);
            carry=mul/10;            
        }
        curr=head;
            for(int i=0;i<list.size();i++)
            {
                curr.val=list.get(i)%10;
                curr=curr.next;
            }       

            if(carry>0)
            {
                ListNode dummy=new ListNode(carry);
                dummy.next=head;
                return dummy;
            }
            else
            {
                return head;
            }
        
        
    }
}