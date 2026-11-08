class Solution {
    public int countServers(int[][] grid) 
    {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    if(check(i,j,grid,m,n))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
        private boolean check(int i, int j, int[][] grid, int m, int n) {
    
    for (int k = 0; k < m; k++) {
        if (k != i && grid[k][j] == 1) {
            return true;
        }
    }
    
    
    for (int l = 0; l < n; l++) {
        if (l != j && grid[i][l] == 1) {
            return true;
        }
    }
    
    return false;
}

}