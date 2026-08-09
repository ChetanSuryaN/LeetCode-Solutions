class Solution {
  
    public int romanToInt(String s)
    {
        int i,n;
        n=s.length();
        char c,c1;
        int sum=0;
        for(i=0;i<n;i++)
        {
            c=s.charAt(i);
           
            if(i==n-1)
            {
                sum=sum+value(c);
            }
            else
            {
                 c1=s.charAt(i+1);
             if(value(c)>=value(c1))
            {
                sum=sum+value(c);
            }
            else
            {
                sum=sum-value(c);
            }
            }
            
        }
        return sum;
    }
    public int value(char c)
    {
        switch (c)
        {
            case 'I':
            return 1;
            

            case 'V':
            return 5;
            

            case 'X':
            return 10;
            

            case 'L':
            return 50;
            

            case 'C':
            return 100;

            case 'D':
            return 500;

            case 'M':
            return 1000;
            
        }
        return 0;
    }
}