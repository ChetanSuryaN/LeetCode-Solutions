class Solution {
    public int[] shortestToChar(String s, char c) 
    {
        char chr[]=s.toCharArray();
        int ans[]=new int[s.length()];
        int occurrences =(int) s.chars().filter(ch -> ch == c).count();
        int pos[]=new int[occurrences];
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            ans[i]=Integer.MAX_VALUE;
            if(chr[i]==c)
            {
                pos[j]=i;
                j++;
            }

        }
         for(int i=0;i<s.length();i++)
         {
            for(int k=0;k<j;k++)
            {
                ans[i]=Math.min(ans[i],Math.abs(pos[k]-i));
            }
         }
         return ans;
        
    }
}