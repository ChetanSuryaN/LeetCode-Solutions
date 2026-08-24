class Solution {
    public int longestPalindrome(String s) 
    {
        boolean hascentre=false;
       int[] c=new int[26];
        int[] ca =new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            c[s.charAt(i)-'a']++;
            else
            ca[s.charAt(i)-'A']++;
        }
        
        for(int i=25;i>=0;i--)
        {
            if(c[i]%2==0)
            {
                ans+=c[i];
            }
            else
            {
                ans+=c[i]-1;
                hascentre=true;
            }
            if(ca[i]%2==0)
            {
                ans+=ca[i];
            }
            else
            {
                ans+=ca[i]-1;
                hascentre=true;
            }
        }
        return hascentre?ans+1:ans;
        
    }
}