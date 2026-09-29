class Solution {
    public int[][] onesMinusZeros(int[][] grid) 
    {
        int onerow[]=new int[grid.length];
        int zerorow[]=new int[grid.length];
        int onecol[]=new int[grid[0].length];
        int zerocol[]=new int[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    zerorow[i]++;
                    zerocol[j]++;
                }
                else
                {
                    onecol[j]++;
                    onerow[i]++;
                }
            }
        }
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                grid[i][j]=onerow[i]+onecol[j]-zerorow[i]-zerocol[j];
            }
        }
        return grid;
    }
}