class Solution {
    public String longestPalindrome(String s) 
    {
        
        String ans="";
        for(int i=0;i<s.length();i++)
        {
           String abc= expand(s,i);
           if(abc.length()>ans.length())
           {
            ans=abc;
           }
           String xyz=expandeven(s,i);
           if(xyz.length()>ans.length())
           {
            ans=xyz;
           }
        }
        return ans;
        
    }

    public String expand(String s,int i)
    {
        StringBuilder sb=new StringBuilder();
        int left=i-1;
        int right=i+1;
        sb.append(s.charAt(i));
        while(left>=0&&right<s.length())
        {
            if(s.charAt(right)==s.charAt(left))
            {
            sb.append(s.charAt(right));
            sb.insert(0,s.charAt(left));
            }
            
            else
            {
                break;
            }
            left--;
            right++;
        }
        return new String(sb);
    }
    public String expandeven(String s,int i)
    {
        StringBuilder sb=new StringBuilder();
        int left=i;
        int right=i+1;
        
        while(left>=0&&right<s.length())
        {
            if(s.charAt(right)==s.charAt(left))
            {
            sb.append(s.charAt(right));
            sb.insert(0,s.charAt(left));
            }
            
            else
            {
                break;
            }
            left--;
            right++;
        }
        return new String(sb);
    }


}