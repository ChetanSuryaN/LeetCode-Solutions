class Solution {
    public long countCommas(long n) 
    {
        long ans=0;
        if(n<1000)
        {
            return 0;
        }
        if(n-999>0)
        {
            ans+=n-999;
        }
        if(n-999999>0)
        {
            ans+=n-999999;
        }
        if(n>999999999L)
        {
            ans+=n-999999999L;
        }
        if(n>999999999999L)
        {
            ans+=n-999999999999L;
        }
        if(n>999999999999999L)
        {
            ans+=n-999999999999999L;
        }
        return ans;
       
        
    }
}