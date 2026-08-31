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
    public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        
        ListNode curr=head.next;
        int prev=head.val;
        
        int i=1;
        
        int firstindex=-1;
        int previndex=-1;
         int mindis=Integer.MAX_VALUE;        
        while(curr!=null&&curr.next!=null)
        {
            if((curr.val>prev&&curr.val>curr.next.val)||(curr.val<prev&&curr.val<curr.next.val))
            {
                if(firstindex==-1)
                {
                    firstindex=i;
                }  
                else
                {
                    mindis=Math.min(mindis,i-previndex);
                }
                previndex=i;             
            }
           
            
            prev=curr.val;
            i++;
            curr=curr.next;
        }
          int arr[]=new int[2];
        if(previndex==-1||previndex==firstindex)
        {
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
    
      arr[0]=mindis;
      arr[1]=previndex-firstindex;
      return arr;
    }
}