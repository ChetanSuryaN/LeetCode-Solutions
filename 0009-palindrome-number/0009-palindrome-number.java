class Solution {
    public boolean isPalindrome(int x)
     {
        int temp,rev=0,rem=0;
        if(x%10==0 && x!=0)
        {
            return false;
        }
        while(x>rev)
        {
           
           
                rem=x%10;
                
                rev=rev*10+rem;
                x=x/10;
        }
               
               
            
           
                    if(rev==x)
                    {
                        return true;
                    }
                    temp=rev/10;
                    if(temp==x)
                    {
                        return true;
                    }
                
         return false;

    }
}