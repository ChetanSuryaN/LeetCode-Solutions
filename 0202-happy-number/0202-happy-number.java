class Solution {
    public boolean isHappy(int n) 
    {
        String str=String.valueOf(n);
        while(n>6)
        {
            n-=n;
            for(int i=0;i<str.length();i++)
            {
                int x=str.charAt(i)-'0';
                n+=x*x;
            }
            str=String.valueOf(n);
        }
        return n==1;

       
        
    }
}