class Solution {
    public int mySqrt(int x) 
    {
        int i;
        int low=1;
        int high=x;
        int mid;
        int ans=0;
        if(x==0||x==1)
        {
            return x;
        }
        while(high>=low)

        {

            mid=(high+low)/2;
           if(mid<=x/mid)
           {
            ans=mid;
           
          
            low=mid+1;
           }
           else
           high=mid-1;
           
        }
        return ans;
    }
}