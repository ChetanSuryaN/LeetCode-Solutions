class Solution {
    public boolean isPowerOfThree(int n) 
    {
        double num=Double.valueOf(n);
        while (num>0)
        {
            if(num==1)
            {
                return true;
            }
            num=num/3;
        }
        return false;
        
    }
}