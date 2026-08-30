class Solution {
    public int sumDecoded(long[] nums) 
    {
        long sum=0;
        
        for(int i=0;i<nums.length;i++)
            {
                long temp=nums[i];
                int width=(int)(temp%10);
                String s=String.valueOf((long)Math.floor((temp/10)));
                

                long base=Long.valueOf(s.substring(0,width));
                long pow=Long.valueOf(s.substring(width,s.length()));
                long value=1;

                while(pow>0)
                    {
                        if(pow%2==1)
                        {
                            value=(value*base)%1000000007;
                        }
                        base=(base*base)%1000000007;
                        pow=pow/2;
                    }

                
                sum=sum+value;
                
                
            }
        return (int)(sum%1000000007);
        
    }
}