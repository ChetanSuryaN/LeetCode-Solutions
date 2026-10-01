class Solution 
{
    int memo[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        memo=new int[m][n];
        for(int row[]:memo)
        Arrays.fill(row,-1);
        return helper(0,0,m,n,obstacleGrid);        
    }
    public int helper(int i,int j,int m, int n, int arr[][])
    {
        if(i>=m||j>=n||arr[i][j]==1)
        {
            return 0;
        }
        if(i==m-1&&j==n-1)
        {
            return 1;
        }
        if(memo[i][j]!=-1)
        {
            return memo[i][j];
        }
        memo[i][j]=helper(i+1,j,m,n,arr)+helper(i,j+1,m,n,arr);
        return memo[i][j];
        
    }
}