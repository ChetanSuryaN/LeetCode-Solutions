class Solution {
    public int lengthOfLastWord(String s)
     {
        int i,count=0,n;
        char c;
        s=s.trim();
        n=s.length();
        for(i=n-1;i>=0;i--)
        { 
            c=s.charAt(i);
            if(c==' ')
            {
                return count;
            }
            count++;
        }
        return count;
        
    }
}