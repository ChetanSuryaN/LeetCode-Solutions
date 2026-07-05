class Solution {
    public boolean isPowerOfFour(int n) 
    {
        double num=Double.valueOf(n);
        

        while(num>0)
        {
            
            if(num==1)
            {
                return true;
            }
            num=num/4;
        }
        return false;
        
    }
}