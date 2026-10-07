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
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        ListNode dummy=new ListNode(0);
        ListNode scan=new ListNode(0);
        dummy=scan;
        ListNode curr=head;
        while(curr!=null)
        {
            if(!set.contains(curr.val))
            {
                scan.next=curr;
                scan=scan.next;
            }
            curr=curr.next;
        }
        scan.next=null;
        return dummy.next;
        
    }
}