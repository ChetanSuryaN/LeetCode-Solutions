class Solution 
{
    int memo[][];
    public int minPathSum(int[][] grid) 
    {
        memo=new int[grid.length][grid[0].length];
        for(int row[]:memo)
        {
            Arrays.fill(row,-1);
        }
        return helper(0,0,grid.length,grid[0].length,grid);
             
    }
    public int helper(int i,int j,int m,int n,int arr[][])
    {
        if(i>=m||j>=n)
        {
            return Integer.MAX_VALUE;
        }
        if(i==m-1&&j==n-1)
        {

            return arr[i][j];
        }
        if(memo[i][j]!=-1)
        {
            return memo[i][j];
        }
        int bottom=helper(i+1,j,m,n,arr);
        int right=helper(i,j+1,m,n,arr);
        
            memo[i][j]=arr[i][j]+Math.min(bottom,right);
        

        return memo[i][j];
    }
}