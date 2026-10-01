class Solution 
{
    int memo[][];
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int n=triangle.size();
        memo=new int[n][n];
        for(int c[]:memo)
        {
            Arrays.fill(c,-999999);
        } 
        return helper(0,0,n,triangle);
    }
    public int helper(int i,int j,int n,List<List<Integer>> list)
    {
        if(i>=n||j>=n)
        {
            return Integer.MAX_VALUE;
        }
        if(i==n-1)
        {
            List<Integer> l1=list.get(i);
            return l1.get(j); 
        }
        if(memo[i][j]!=-999999)
        {
            return memo[i][j];
        }
        memo[i][j]=Math.min(helper(i+1,j,n,list),helper(i+1,j+1,n,list));
         List<Integer> l1=list.get(i);
         memo[i][j]+=l1.get(j);
         return memo[i][j];

    }
}