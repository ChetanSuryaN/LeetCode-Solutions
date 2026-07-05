class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        int k=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int x=Math.min(s.length,g.length);
        for(int i=0;i<g.length;i++)
        {
           for(int j=0;j<s.length;j++)
           {
            if(s[j]>=g[i])
            {
                k++;
                g[i]=Integer.MAX_VALUE;
                s[j]=0;
            }
           }
        }
        return k;
        
    }
}