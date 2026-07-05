class Solution {
    public String longestCommonPrefix(String[] str) 
    {
        int i,n,j;
        char c;
        n=str[0].length();
        if(str.length==0)
        {
            return "";
        }
        for(i=0;i<n;i++)
        {
             c=str[0].charAt(i);
             for(j=0;j<str.length;j++)
             {
                if(i==str[j].length()||str[j].charAt(i)!=c)
                {
                    return str[0].substring(0,i);
                }
             }
        }
        return str[0];
    }
}