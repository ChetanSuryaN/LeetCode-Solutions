class Solution {
    public int compress(char[] chars) 
    {
        int j=-1;
        int i=0;
        int len=0;
        while(i<chars.length)
        {
            char curr=chars[i];
            int last=i;
            while(last<chars.length&&(chars[i]==chars[last]))
            {
                last++;
            }
            chars[++j]=curr;
            String diff=String.valueOf(last-i);
            if(last-i>1)
            {      
                for(int k=0;k<diff.length();k++)
                {
                    chars[++j]=diff.charAt(k);
                }        
             len+=diff.length();
            }
            len++;
            i=last;


        }
        return len;
        
    }
}