class Solution {
    public int myAtoi(String s) 
    {
        s=s.trim();
        long ans=0;
        int key=1;
        int count=0;
        if(s.length()==0)
        {
            return 0;
        }
        if(s.charAt(0)=='-')
        {
            key=-1;
        }
        else if(s.charAt(0)=='+')
        {
            key=1;
        }
        else if(Character.isDigit(s.charAt(0)))
        {
            
            ans=s.charAt(0)-'0';
        }
        else
        {
            return 0;
        }
        for(int i=1;i<s.length();i++)
        {
           
            if(Character.isDigit(s.charAt(i)))
           {
            if(key*(ans*10+s.charAt(i)-'0')>=Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
          if(key*(ans*10+s.charAt(i)-'0')<=Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }

            ans=ans*10+s.charAt(i)-'0';
           }
           else
           {
            break;
           }
        }
        ans*=key;
        
        return (int)ans;

        
    }
}