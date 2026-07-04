import java.math.*;
class Solution {
    public int reverse(int x)
     {
        if(x>Integer.MAX_VALUE-2|| x<Integer.MIN_VALUE )
        {
            return 0;
        }
        else
        {
      int temp,rev=0,rem=0;
       temp=x;
       int k=0;
       if(temp<0)
       {
        temp=-temp;
        k=1;
       }
      while(temp>0)
      {
        rem=temp%10;
        
        temp=temp/10;
         if (rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE && rem>7  )
      {
        return 0;
      }
      rev=rev*10+rem;
     

      }
      
    
      
       if (k==1)
       {
        rev=-rev;
       }
      return rev;
      
      }   
    }
}