class Solution 
{
    int mem[];
    public int numDecodings(String s) 
    {
        mem=new int[s.length()];
        Arrays.fill(mem,-1);
        return helper(0,s);
    }
    private int helper(int i,String s)
    {
         if(i==s.length())
        {
            return 1;
        }
        if(s.charAt(i)=='0')
        {
            return 0;
        }
       
        if(mem[i]!=-1)
        {
            return mem[i];
        }
        int ways=helper(i+1,s);
        if(i<s.length()-1)
        {
        int two=(s.charAt(i)-'0')*10+s.charAt(i+1)-'0';
        if(two>=10&&two<=26)
        {
           ways+=helper(i+2,s);
        }
        }
        mem[i]=ways;
        return mem[i];
    }
}