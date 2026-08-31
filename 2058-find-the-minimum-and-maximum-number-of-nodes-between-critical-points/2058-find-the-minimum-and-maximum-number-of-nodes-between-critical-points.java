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
        List<Integer> list=new ArrayList<>();
        
        ListNode curr=head.next;
        int prev=head.val;
        int max=-1;
        int i=1;
        int min=0;
        while(curr!=null&&curr.next!=null)
        {
            if(curr.val>prev&&curr.val>curr.next.val)
            {
               list.add(i);
            }
            else if(curr.val<prev&&curr.val<curr.next.val)
            {
                list.add(i);
            }
            prev=curr.val;
            i++;
            curr=curr.next;
        }
       int arr[]=new int[2];
       if(list.size()<2)
       {
         arr[0]=-1;
         arr[1]=-1;
         return arr;
       }
       int mindis=Integer.MAX_VALUE;
       for(int k=0;k<list.size()-1;k++)
       {
        mindis=Math.min(list.get(k+1)-list.get(k),mindis);         
       }
       arr[1]=list.get(list.size()-1)-list.get(0);
       arr[0]=mindis;
       return arr;

    }
}