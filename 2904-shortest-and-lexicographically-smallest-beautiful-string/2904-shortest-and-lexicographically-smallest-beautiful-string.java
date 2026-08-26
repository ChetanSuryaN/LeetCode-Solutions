class Solution {
    public String shortestBeautifulSubstring(String s, int k) 
    {
        int len=Integer.MAX_VALUE;
        int left=0;
        int one=0;
        String ans="";
        for(int right=0;right<s.length();right++)
        {
            if(s.charAt(right)=='1')
            {
                one++;
            }
            while(one==k)
            {
                if(len>right-left+1)
                {
                    ans=s.substring(left,right+1);
                    len=right-left+1;
                }
                else if(len==right-left+1)
                {
                    String tempans=s.substring(left,right+1);
                    if(tempans.compareTo(ans)<0)
                    {
                        ans=tempans;
                    }
                }
                if(s.charAt(left)=='1')
                {
                    one--;
                }
                left++;
            }
        }
        return ans;
        
    }
}