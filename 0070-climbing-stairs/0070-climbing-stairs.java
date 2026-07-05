class Solution {
    public int climbStairs(int n)
     {
        int prev1=1,prev2=1,i,curr=0;
        if(n<=1)
        {
            return 1;
        }
        
        for(i=2;i<=n;i++)
        {
            curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;

        
     }
}