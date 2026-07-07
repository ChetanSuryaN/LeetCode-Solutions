class Solution {
    public long sumAndMultiply(int n) 
    {
        long num=0;
        long sum=0;
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)-'0'!=0)
            {
                num=num*10+str.charAt(i)-'0';
                sum+=str.charAt(i)-'0';
            }
        }
        return num*sum;
        
    }
}